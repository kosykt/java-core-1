package HW12;

public class HW12 {

    int SIZE = 10000000;
    int HALF = SIZE / 2;

    public static void main(String[] args) {

        HW12 hw = new HW12();

        new Thread(() -> hw.MyThreadOne()).start();
        new Thread(() -> hw.MyThreadTwo()).start();
    }

    public void MyThreadOne() {

        float[] arr = new float[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        Thread t = new Thread(new MyRunnable(arr));
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время первого потока(t1): " + (System.currentTimeMillis() - a));
    }

    public void MyThreadTwo() {
        float[] arrOriginal = new float[SIZE];

        float[] arrHalf1 = new float[HALF];
        float[] arrHalf2 = new float[HALF];

        for (int i = 0; i < SIZE; i++) {
            arrOriginal[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        Thread t1 = new Thread(new MyRunnable(arrHalf1));
        Thread t2 = new Thread(new MyRunnable(arrHalf2));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время второго потока(t2): " + (System.currentTimeMillis() - a));
    }
}

class MyRunnable implements Runnable {

    private float[] arr;

    public MyRunnable(float[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        }
    }
}