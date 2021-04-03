package HW12;

public class HW12 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
    }

    public static void MyThreadOne(){
        int SIZE = 10000000;
        int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
        float[] arrHalf = new float[HALF];
        Long counter;
    }

    public static void MyThreadTwo(){
        int SIZE = 10000000;
        int HALF = SIZE / 2;
        float[] arr = new float[SIZE];
    }
}
