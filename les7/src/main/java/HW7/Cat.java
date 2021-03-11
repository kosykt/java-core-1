package HW7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fulless;

    public Cat(String name, int appetite, boolean fulless) {
        this.name = name;
        this.appetite = appetite;
        this.fulless = fulless;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}