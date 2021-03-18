package WH8;

public class Wall implements ObstacleСourse{
    protected static int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean trying(int num, String n) {
        if (num >= height){
            System.out.println(n + " смог перепрыгнуть");
            return true;
        }else {
            System.out.println(n + " не смог перепрыгнуть");
            return false;
        }
    }
}
