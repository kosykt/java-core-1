package HW7;

public class Cat {
    private String name;
    private int appetite;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        int valueCheck = Plate.getFood();
        if (valueCheck - appetite >= 0) {
            p.decreaseFood(appetite);
        } else {
            System.out.println(name + " требует еще еды");
        }

    }
}