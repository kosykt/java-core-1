package Les;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Les13 {

    private static int SIZE = 1000000;
    private static int PART_SIZE = 200000;

    public static void main(String[] args) {
        long[] ints = new long[SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            ints[i] = random.nextInt();
        }
        long start = System.currentTimeMillis();
        System.out.println(Arrays.stream(ints).sum());
        System.out.println("first " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        List<Summa> summas = new ArrayList<>(SIZE / PART_SIZE);
        for (int i = 0; i < SIZE; i += PART_SIZE) {
            summas.add(new Summa(ints, i, Math.min(i + PART_SIZE, SIZE)));
        }

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(SIZE / PART_SIZE);
        try {
            List<Future<Long>> futures = fixedThreadPool.invokeAll(summas);
            long sum = futures.stream()
                    .mapToLong(f -> {
                        try {
                            return f.get();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }).sum();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("second " + (System.currentTimeMillis() - start));
        fixedThreadPool.shutdown();
    }
}

class Summa implements Callable<Long>{
    long[] a;
    int start, end;

    public Summa(long[] a, int start, int end) {
        this.a = a;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += a[i];
        }
        return sum;
    }
}