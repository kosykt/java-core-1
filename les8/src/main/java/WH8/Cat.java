package WH8;

public class Cat {
    private String name;
    private int run;
    private int jump;

    public Cat(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }

    public String getName() {
        return name;
    }
}
