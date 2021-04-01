package HW11_3;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    private List<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public boolean addIn(T fruit){
        return fruits.add(fruit);
    }

    public Double getWeight(double m){
        return (fruits.size() * m);
    }

    public static <A> Box<A> create(){
        return new Box<A>();
    }

    public static <A> Box<A> putIn(Box<A> box, A fruit, int m){
        for (int i = 0; i < m; i++) {
            box.addIn(fruit);
        }
        return box;
    }

    public static <A> String compare(Box<A> box1, Box<A> box2){
        if (box1.getWeight(1) > box2.getWeight(1)){
            return "Первая коробка больше";
        }else {
            return "Вторая коробка больше";
        }
    }
}
