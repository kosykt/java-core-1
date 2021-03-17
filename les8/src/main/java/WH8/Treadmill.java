package WH8;

public class Treadmill implements Obstacle {
    private static int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public boolean canRun(int r, String s){
        if (r >= distance){
            System.out.println(s + " смог пробежать");
            return true;
        }else {
            System.out.println(s + " не смог пробежать");
            return false;
        }
    }

    @Override
    public void trying(int param) {
        if (param >= distance){
            System.out.println(" смог пробежать");

        }else {
            System.out.println(" не смог пробежать");

        }
    }
}
