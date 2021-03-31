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
}
