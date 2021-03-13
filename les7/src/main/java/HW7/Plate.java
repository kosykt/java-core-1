package HW7;

public class Plate {
    private static int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void info() {
        System.out.println("Количество еды: " + food);
    }

    public static int getFood() {
        return food;
    }
}
