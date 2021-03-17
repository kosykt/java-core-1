package WH8;

public abstract class AbstractLane {

    public void trying(int run, int jump, String name){
        if (Treadmill.distance <= run) {
            System.out.println(name + " пробежал");
            if (Wall.height <= jump){
                System.out.println(name + " перепрыгнул");
            }else {
                System.out.println(name + " не перепрыгнул");
            }
        }else {
            System.out.println(name +" не пробежал и не допускается к прыжку");
        }
    }
}
