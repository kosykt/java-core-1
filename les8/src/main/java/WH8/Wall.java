package WH8;

public class Wall implements Obstacle{
    private static int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean canJump(int j, String s){
        if (j >= height){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean trying(int r, String s) {
        if (r >= height){
            System.out.println(s + " смог перепрыгнуть");
            return true;
        }else {
            System.out.println(s + " не смог перепрыгнуть");
            return false;
        }
    }
}
