package HW11_3;

public class HW11_3 {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox = new Box();

        Apple a1 = new Apple(1.0);
        appleBox.addIn(a1);
        Orange o1 = new Orange(1.2);
        orangeBox.addIn(o1);

    }
}
