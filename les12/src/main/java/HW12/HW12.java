package HW12;

public class HW12 {

    int SIZE = 10;
    int HALF = SIZE / 2;

    public static void main(String[] args) {

        HW12 hw = new HW12();

        new Thread(() -> hw.MyThreadOne()).start();
        new Thread(() -> hw.MyThreadTwo()).start();
    }

    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
        return arr;
    }

    public void MyThreadOne() {

        float[] arr = new float[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1.0f;
        }

        long a = System.currentTimeMillis();

        calculate(arr);

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

        System.out.println("Время второго потока(t2): " + (System.currentTimeMillis() - a));
    }
}