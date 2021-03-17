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
    public int trying(int r, int s) {
        int point = 0;
        if (s >= height){
            System.out.println(" смог перепрыгнуть");
            return ++point;
        }else {
            System.out.println(" не смог перепрыгнуть");
            return ++point;
        }
    }
}
