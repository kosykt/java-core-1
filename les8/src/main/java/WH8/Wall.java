package WH8;

public class Wall implements Obstacle{
    private static int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void canJump(int j, String s){
        if (j >= height){
            System.out.println(s + " смог перепрыгнуть");

        }else {
            System.out.println(s + " не смог перепрыгнуть");

        }
    }

    @Override
    public boolean trying(int r) {
        if (r >= height){
            System.out.println(" смог перепрыгнуть");
            return true;
        }else {
            System.out.println(" не смог перепрыгнуть");
            return false;
        }
    }
}
