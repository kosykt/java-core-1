package Les6;

public class Cat extends Animal{

    public Cat(String name, String color, int age, int run, int swim) {
        super(name, color, age, run, swim);
        if (run <= catRunLimit){
            this.run = run;
        }else {
            this.run = catRunLimit;
        }
        if (swim != catSwimLimit){
            this.swim = catSwimLimit;
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
        if (this.swim == s){
            return (this.name + " стоит у берега");
        }else {
            return (this.name + " отказывается плыть");
        }
    }
}
