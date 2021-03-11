package HW7;

public class Plate {
    private static int food;
    public Plate(int food) {
        this.food = food;
    }
    public static int decreaseFood(int n) {
        int x = 0;
        if (food - n >= 0){
            food -= n;
        }
        return x;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
}
