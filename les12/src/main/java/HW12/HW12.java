package HW12;

public class HW12 {

    public static void main(String[] args) {
        HW12 wh = new HW12();

        new Thread(() -> wh.MyThreadOne()).start();
        new Thread(() -> wh.MyThreadTwo()).start();
    }

    public void MyThreadOne(){
        int SIZE = 10;
        float[] arr = new float[SIZE];
        int num = 1;

        for (int i = 0; i < SIZE; i++) {
            arr[i] = num;
        }

        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время первого потока(t1): " + (System.currentTimeMillis() - a));
    }

    public void MyThreadTwo(){
        int SIZE = 10;
        int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        int num = 1;


        for (int i = 0; i < SIZE; i++) {
            arr[i] = num;
        }

        long a = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время второго потока(t2): " + (System.currentTimeMillis() - a));
    }
}


