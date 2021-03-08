package Les6;

public class Dog extends Animal{

    public Dog(String name, String color, int age, int run, int swim) {
        super(name, color, age, run, swim);
        if (run <= dogRunLimit){
            this.run = run;
        }else {
            this.run = dogRunLimit;
        }
        if (run <= dogSwimLimit){
            this.swim = run;
        }else {
            this.swim = dogSwimLimit;
        }
    }

    @Override
    String run(int r){
        if (r <= this.run){
            return (this.name + " пробежал: " + r);
        }
        return (this.name + " может пробежать только: " + this.run);
    }

    @Override
    String swim(int s){
        if (s <= this.swim){
            return (this.name + " проплыл: " + s);
        }else {
            return (this.name + " может проплыть только: " + this.swim);
        }
    }
}