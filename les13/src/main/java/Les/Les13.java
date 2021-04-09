package Les;

import java.util.Arrays;
import java.util.concurrent.*;

public class Les13 {
    public static void main(String[] args) {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        int[] a = {1,2,3,4,5,6,7,8,9};

        Callable<Integer> task = () -> Arrays.stream(a).sum();
        Future<Integer> submit = fixedThreadPool.submit(task);

        submit.isDone();
        try {
            Integer i = submit.get();
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        fixedThreadPool.shutdown();
    }
}