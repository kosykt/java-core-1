package Les6;

public class Animal {
    String name;
    String color;
    int age;
    int run;
    int swim;


    public Animal(String name,String color, int age, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
    }

    void printA(){
        System.out.println(name);
    }

}
