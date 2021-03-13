package HW7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    private int valueCheck;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        valueCheck = Plate.getFood();
        if (valueCheck - appetite >= 0) {
            checkFullness();
            p.decreaseFood(appetite);
        } else {
            int a = appetite - Plate.getFood();
            //по моему это какой-то костыль, но по другому я не придумал как это реализовать
            System.out.printf("%s'у не хватает %d еды\n", name, a);
        }
    }

    private void checkFullness() {
        valueCheck = Plate.getFood();
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

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}