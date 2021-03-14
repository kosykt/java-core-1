package WH8;

public class Treadmill {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public boolean canRun(int r){
        if (r >= distance){
            return true;
        }
        return false;
    }
}
