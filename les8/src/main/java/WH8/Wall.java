package WH8;

public class Wall implements ObstacleСourse{
    protected static int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public int getValue() {
        return height;
    }
}
