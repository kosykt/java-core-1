package WH8;

public abstract class AbstractLane {

    public void trying(int r, int j, String s){
        if (Treadmill.distance <= r) {
            System.out.println("пробежал");
            if (Wall.height <= j){
                System.out.println("перепрыгнул");
            }else {
                System.out.println("не перепрыгнул");
            }
        }else {
            System.out.println("не пробежал");
        }
    }
}
