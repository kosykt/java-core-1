import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HW12 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(new MyRunnable(counter));
        Thread t2 = new Thread(new MyRunnable(counter));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.getCount());

    }
}

class Counter{

    private long count;
    private final Lock lock = new ReentrantLock();

    public Counter() {
    }

    public long getNextId() {
            try {
                lock.lock();
                return count++;
            }finally {
                lock.unlock();
            }
    }

    public long getCount() {
        return count;
    }
}

class MyRunnable implements Runnable {

    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            counter.getNextId();
        }
    }
}
