package HW11_3;

public class HW11_3 {

    public static void main(String[] args) {
        Box<Apple> appleBox1 = Box.create();
        appleBox1.addIn(new Apple());
        appleBox1.addIn(new Apple());

        Box<Apple> appleBox2 = Box.putIn(Box.create(), new Apple(),5);

//        String s = Box.compare(appleBox1, appleBox2);
//        System.out.println(Box.compare(appleBox1, appleBox2));

        System.out.println(appleBox1.getWeight());
        System.out.println(appleBox2.getWeight());


//        Box<Apple> appleBox = new Box();
//        Box<Orange> orangeBox = new Box();
//        Box.create(Apple);
//
//        appleBox.addIn(new Apple());
//        appleBox.addIn(new Apple());
//        appleBox.addIn(new Apple());
//
//        orangeBox.addIn(new Orange());
//        orangeBox.addIn(new Orange());
//        orangeBox.addIn(new Orange());
//        orangeBox.addIn(new Orange());
//        orangeBox.addIn(new Orange());
//
//        System.out.println(orangeBox.getWeight(new Orange().getMass()));
    }
}
