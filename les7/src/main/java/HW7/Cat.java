package HW7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        int valueCheck = Plate.getFood();
        if (valueCheck - appetite >= 0) {
            checkFullness();
            p.decreaseFood(appetite);
        } else {
            System.out.println(name + "'у не хватает еды");
        }
    }

    private void checkFullness() {
        int valueCheck = Plate.getFood();
        if (valueCheck >= appetite){
            fullness = true;
        }
    }

    public void isFullness() {
        if (fullness) {
            System.out.println(name + " поел");
        }else {
            System.out.println(name + " голоден");
        }
    }
}