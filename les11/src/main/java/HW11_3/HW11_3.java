package HW11_3;

public class HW11_3 {

    public static void main(String[] args) {

        Box<Apple> appleBox = new Box();
        Box<Orange> orangeBox = new Box();


        appleBox.addIn(new Apple());
        appleBox.addIn(new Apple());
        appleBox.addIn(new Apple());

        orangeBox.addIn(new Orange());
        orangeBox.addIn(new Orange());
        orangeBox.addIn(new Orange());
        orangeBox.addIn(new Orange());
        orangeBox.addIn(new Orange());


        System.out.println(appleBox.getWeight(new Apple().getMass()));
        System.out.println(orangeBox.getWeight(new Orange().getMass()));
    }
}
