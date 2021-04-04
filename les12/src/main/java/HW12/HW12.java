package HW12;

import java.util.Arrays;

public class HW12 {

    int SIZE = 10;
    int HALF = SIZE / 2;

    public static void main(String[] args) {

        HW12 hw = new HW12();
        new Thread(() -> hw.MyThreadOne()).start();
        new Thread(() -> hw.MyThreadTwo()).start();
    }

    public void MyThreadOne(){

        float[] arr = new float[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        MyRunnable1 thr = new MyRunnable1(arr);

        Thread t = new Thread(thr);

        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(Arrays.toString(thr.getArr()));

        System.out.println("Время первого потока(t1): " + (System.currentTimeMillis() - a));
    }

    public void MyThreadTwo(){


        float[] arr = new float[SIZE];

        float[] arrHalf1 = new float[HALF];
        float[] arrHalf2 = new float[HALF];

        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.0f;
        }

        System.arraycopy(arr, 0, arrHalf1, 0, arrHalf1.length);
        System.arraycopy(arr, arrHalf1.length, arrHalf2,0 , arrHalf2.length);

//        System.out.println(Arrays.toString(arrHalf1));
//        System.out.println(Arrays.toString(arrHalf2));


        MyRunnable2 thr2 = new MyRunnable2(arrHalf1);
        MyRunnable3 thr3 = new MyRunnable3(arrHalf2);
        Thread t2 = new Thread(thr2);
        Thread t3 = new Thread(thr3);

        t2.start();
        t3.start();
        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        System.out.println(Arrays.toString(thr2.getArr()));
//        System.out.println(Arrays.toString(thr3.getArr()));

//        arrHalf1 = thr2.getArr();
//        arrHalf2 = thr3.getArr();
//
//        System.out.println(Arrays.toString(arrHalf1));



        System.out.println("Время второго потока(t2): " + (System.currentTimeMillis() - a));
    }
}

class MyRunnable1 implements Runnable {

    private float[] arr;

    public MyRunnable1(float[] arr) {
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

class MyRunnable2 implements Runnable {

    private float[] arr;

    public MyRunnable2(float[] arr) {
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

class MyRunnable3 implements Runnable {

    private float[] arr;

    public MyRunnable3(float[] arr) {
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