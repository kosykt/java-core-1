package HW12;

public class HW12 {

    public static void main(String[] args) {
        HW12 hw = new HW12();

        new Thread(() -> hw.MyThreadOne()).start();
        new Thread(() -> hw.MyThreadTwo()).start();
    }

    public void MyThreadOne() {
        int SIZE = 10000000;
        float[] arr = new float[SIZE];
        int num = 1;

        for (int i = 0; i < SIZE; i++) {
            arr[i] = num;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время первого потока(t1): " + (System.currentTimeMillis() - a));
    }

    public void MyThreadTwo() {
        int SIZE = 10000000;
        int HALF = SIZE / 2;
        float[] arrOriginal = new float[SIZE];

        float[] arrHalf1 = new float[HALF];
        float[] arrHalf2 = new float[HALF];

        int num = 1;

        for (int i = 0; i < SIZE; i++) {
            arrOriginal[i] = num;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arrOriginal, 0, arrHalf1, 0, arrHalf1.length);
        System.arraycopy(arrOriginal, arrHalf1.length, arrHalf2, 0, arrHalf2.length);

        System.out.println("Время второго потока(t2): " + (System.currentTimeMillis() - a));
    }

    public float[] Calculate(float[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = (float)(a[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return a;
    }
}