
package Les6;

public class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int run;
    protected int swim;
    protected final int catRunLimit = 200;
    protected final int catSwimLimit = 0;
    protected final int dogRunLimit = 500;
    protected final int dogSwimLimit = 10;
    protected static int animalsQuantity = 0;

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

    public static int getAnimalsQuantity(){
        return animalsQuantity;
    }
}
