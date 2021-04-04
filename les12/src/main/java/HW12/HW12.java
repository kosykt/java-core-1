package HW12;

import java.util.Arrays;

public class HW12 {


    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThreadOne());
//        Thread t2 = new Thread();
    }
}

class MyThreadOne implements Runnable{
    private static final int SIZE = 10;
    private static final int HALF = SIZE / 2;
    private float[] arr1 = new float[SIZE];
    private float[] arr2 = new float[HALF];
    private int counter = 1;

    public MyThreadOne() {
        for (int i = 0; i < SIZE; i++) {
            arr1[i] = counter;
        }
        run();
    }



    @Override
    public void run() {
        System.out.println(Arrays.toString(arr1));
        long a = System.currentTimeMillis();

        

        System.out.println(System.currentTimeMillis() - a);
    }
}


