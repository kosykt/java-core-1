package WH8;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean canJump(int j){
        if (j >= height){
            return true;
        }
        return false;
    }
}
