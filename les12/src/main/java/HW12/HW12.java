package HW12;

public class HW12 {

    int SIZE = 10000000;
    int HALF = SIZE / 2;
    float NUM = 1.0f;

    public static void main(String[] args) {

        HW12 hw = new HW12();
        new Thread(() -> hw.MyThreadOne()).start();
        new Thread(() -> hw.MyThreadTwo()).start();
    }

    public void MyThreadOne(){

        float[] arr = new float[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = NUM;
        }

        long a = System.currentTimeMillis();

        MyRunnable thr = new MyRunnable(arr);

        Thread t = new Thread(thr);

        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Время первого потока(t1): " + (System.currentTimeMillis() - a));
    }

    public void MyThreadTwo(){

        float[] arr = new float[SIZE];

        float[] arrHalf1 = new float[HALF];
        float[] arrHalf2 = new float[HALF];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = NUM;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arrHalf1, 0, arrHalf1.length);
        System.arraycopy(arr, arrHalf1.length, arrHalf2,0 , arrHalf2.length);

        MyRunnable thr1 = new MyRunnable(arrHalf1);
        MyRunnable thr2 = new MyRunnable(arrHalf2);
        Thread t1 = new Thread(thr1);
        Thread t2 = new Thread(thr2);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(thr1.getArr(), 0, arr, 0, HALF);
        System.arraycopy(thr2.getArr(), 0, arr, HALF, HALF);

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

    public float[] getArr() {
        return arr;
    }
}