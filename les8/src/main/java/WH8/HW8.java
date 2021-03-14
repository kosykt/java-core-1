package WH8;

public class HW8 {
    static Wall w = new Wall(15);
    static Treadmill t = new Treadmill(150);
    static Human[] humansArray = new Human[1];
    static Cat[] catsArray = new Cat[1];
    static Robot[] robotsArray = new Robot[1];

    public static void main(String[] args) {
        humansArray[0] = new Human("Henry", 200,20);
        catsArray[0] = new Cat("Barsik", 100,10);
        robotsArray[0] = new Robot("R2D2", 300,30);

        startRun();
//        startJump();

    }

    private static void startRun() {
        for (int i = 0; i < humansArray.length; i++) {
            if (t.canRun(humansArray[i].getRun(), humansArray[i].getName())){
                if (w.canJump(humansArray[i].getJump(), humansArray[i].getName())) {
                    System.out.println(humansArray[i].getName() + " успешно преодолел испытания");
                }
            }
        }

        for (int i = 0; i < catsArray.length; i++) {
            if (t.canRun(catsArray[i].getRun(), catsArray[i].getName())){
                if (w.canJump(catsArray[i].getJump(), catsArray[i].getName())) {
                    System.out.println(catsArray[i].getName() + " успешно преодолел испытания");
                }
            }
        }
    }

//    private static void startJump() {
//        for (int i = 0; i < humansArray.length; i++) {
//            System.out.println(w.canJump(humansArray[i].getJump()));
//        }
//    }
}
