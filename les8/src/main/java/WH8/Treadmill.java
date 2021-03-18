package WH8;

public class Treadmill implements ObstacleСourse{
    protected static int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public int getValue() {
        return distance;
    }
}
