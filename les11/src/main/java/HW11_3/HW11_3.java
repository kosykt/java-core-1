package HW11_3;

public class HW11_3 {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = Box.putIn(Box.create(), new Apple(),5);
        Box<Apple> appleBox2 = Box.putIn(Box.create(), new Apple(),5);
        Box<Orange> orangeBox1 = Box.putIn(Box.create(), new Orange(), 3);
        Box<Orange> orangeBox2 = Box.putIn(Box.create(), new Orange(), 3);

        System.out.println(appleBox1.getWeight(new Apple()));

        System.out.println(Box.compare(appleBox1, appleBox2));

    }
}
