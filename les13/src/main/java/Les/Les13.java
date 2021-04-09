package Les;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Les13 {
    public static void main(String[] args) {

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        Runnable runnable = () -> {
            System.out.println("Hello " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        fixedThreadPool.execute(runnable);
        fixedThreadPool.execute(runnable);
        fixedThreadPool.execute(runnable);
        fixedThreadPool.execute(runnable);
        fixedThreadPool.execute(runnable);
        fixedThreadPool.execute(runnable);
        fixedThreadPool.execute(runnable);

        fixedThreadPool.shutdown();
    }
}