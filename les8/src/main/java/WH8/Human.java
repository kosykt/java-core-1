package WH8;

public class Human implements Competitors {
    private String name;
    private int run;
    private int jump;

    public Human(String name, int run, int jump) {
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

    @Override
    public int laneRun() {
        return run;
    }

    @Override
    public int laneJump() {
        return jump;
    }
}
