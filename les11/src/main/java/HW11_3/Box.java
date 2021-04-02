package HW11_3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public boolean addIn(T fruit){
        return fruits.add(fruit);
    }

    public Fruit ret(){
        return fruits.get(0);
    }

    public Double getWeight(Fruit f){

        return (fruits.size() * f.getMass());
    }

    public static <A extends Fruit> Box<A> create(){
        return new Box<A>();
    }

    public static <A extends Fruit> Box<A> putIn(Box<A> box, A fruit, int m){
        for (int i = 0; i < m; i++) {
            box.addIn(fruit);
        }
        return box;
    }

    public static String compare(Double box1, Double box2){
        if (box1 > box2){
            return "Первая коробка больше";
        }else if (box1 < box2){
            return "Вторая коробка больше";
        }else {
            return "Коробки равны";
        }
    }
}
