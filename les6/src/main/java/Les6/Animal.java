package Les6;

public class Animal {
    String name;
    String color;
    int age;
    int run;
    int swim;
    int catRunLimit = 200;
    int catSwimLimit = 0;
    int dogRunLimit = 500;
    int dogSwimLimit = 10;


    public Animal(String name,String color, int age, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
    }

    String run (int r){
        return (this.name + " пробежал: " + r);
    }
    String swim (int s){
        return (this.name + " проплыл: " + s);
    }
}
