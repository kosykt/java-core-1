package WH8;

public class Treadmill implements ObstacleСourse{
    protected static int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean trying(int num, String n) {
        if (num >= distance){
            System.out.println(n + " смог пробежать");
            return true;
        }else {
            System.out.println(n + " не смог пробежать");
            return false;
        }
    }
}
