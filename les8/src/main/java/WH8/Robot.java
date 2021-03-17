package WH8;

public class Robot implements Competitors{
    private String name;
    private int run;
    private int jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public String getName() {
        return name;
    }
}
