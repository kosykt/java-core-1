package HW7;

public class HW7 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5, false);
        Plate plate = new Plate(3);
        plate.info();
        cat.eat();
        plate.info();
    }
}

