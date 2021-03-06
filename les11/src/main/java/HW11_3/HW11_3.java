package HW11_3;

public class HW11_3 {

    public static void main(String[] args) {

        Box<Apple> appleBox1 = Box.putIn(Box.create(), new Apple(),2);
        Box<Apple> appleBox2 = Box.putIn(Box.create(), new Apple(),5);
        Box<Orange> orangeBox1 = Box.putIn(Box.create(), new Orange(), 6);
        Box<Orange> orangeBox2 = Box.putIn(Box.create(), new Orange(), 3);

        System.out.println(appleBox1.getWeight(new Apple()));

        System.out.println(Box.compare(appleBox1.getWeight(new Apple()),orangeBox2.getWeight(new Orange())));

        System.out.println(Box.compare(orangeBox1.getWeight(new Orange()), appleBox2.getWeight(new Apple())));

        shift(appleBox1, orangeBox2);
    }

    private static void shift(Box box1, Box box2) {
        if (box1.ret() instanceof Apple && box2.ret() instanceof Apple){
            int num = box1.getSize();
            box1.clearBox();
            for (int i = 0; i < num; i++) {
                box2.addIn(new Apple());
            }
            System.out.println(box2.getSize());
        }else if (box1.ret() instanceof Orange && box2.ret() instanceof Orange){
            int num = box1.getSize();
            box1.clearBox();
            for (int i = 0; i < num; i++) {
                box2.addIn(new Orange());
            }
            System.out.println(box2.getSize());
        }else {
            System.out.println("содержимое коробок разное");
        }
    }
}
