package Les6;

public class HW6 {

    public static void main(String[] args) {

        Cat c1 = new Cat("Barsik", "White", 4, 900, 90);
        Dog d1 = new Dog("Bobik", "Black", 8, 500, 10);
        System.out.println(c1.run(200));
        System.out.println(c1.swim(0));
        System.out.println(d1.run(500));
        System.out.println(d1.swim(10));
    }
}
