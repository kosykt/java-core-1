package WH8;

public class HW8 {
//    static Wall[] w = new Wall[2];
////    static Treadmill[] t = new Treadmill[1];
//    static Human[] humansArray = new Human[1];
//    static Cat[] catsArray = new Cat[1];
//    static Robot[] robotsArray = new Robot[1];
    static Obstacle[] obstaclArray = new Obstacle[2];
    static Competitors[] competitorsArray = new Competitors[2];

    public static void main(String[] args) {
//        humansArray[0] = new Human("Henry", 200,20);
//        catsArray[0] = new Cat("Barsik", 100,10);
//        robotsArray[0] = new Robot("R2D2", 300,30);
//        t[0] = new Treadmill(150);

//        w[0] = new Wall(15);
//        w[1] = new Wall(15);
        competitorsArray[0] = new Human("Henry", 200,10);
        competitorsArray[1] = new Cat("Barsik", 100,20);

        obstaclArray[0] = new Treadmill(150);
        obstaclArray[1] = new Wall(10);


        if(obstaclArray[0].trying(competitorsArray[0].getRun(), competitorsArray[0].getName())){
            obstaclArray[1].trying(competitorsArray[0].getJump(), competitorsArray[0].getName());
        }

//        obstaclArray[0].trying(humansArray[0].getRun());


//        obstaclArray[1].trying(competitorsArray[0].laneRun(), competitorsArray[0].laneJump());

//        obstaclArray[1].trying(humansArray[0].getJump());

        startRun();
    }

    private static void startRun() {
//        for (int i = 0; i < humansArray.length; i++) {
//            if (t[i].canRun(humansArray[i].getRun(), humansArray[i].getName())){
//                if (w[i].canJump(humansArray[i].getJump(), humansArray[i].getName())) {
//                    System.out.println(humansArray[i].getName() + " успешно преодолел испытания");
//                }
//            }
//        }

//        for (int j = 0; j < t.length; j++) {
//            for (int q = 0; q < w.length; q++) {
//                for (int i = 0; i < humansArray.length; i++) {
//                    if (t[j].canRun(humansArray[i].getRun(), humansArray[i].getName())){
//                        if (w[q].canJump(humansArray[i].getJump(), humansArray[i].getName())) {
//                            System.out.println(humansArray[i].getName() + " успешно преодолел испытания");
//                        }
//                    }
//                }
//            }
//        }

//        for (int i = 0; i < catsArray.length; i++) {
//            if (t.canRun(catsArray[i].getRun(), catsArray[i].getName())){
//                if (w.canJump(catsArray[i].getJump(), catsArray[i].getName())) {
//                    System.out.println(catsArray[i].getName() + " успешно преодолел испытания");
//                }
//            }
//        }
//
//        for (int i = 0; i < robotsArray.length; i++) {
//            if (t.canRun(robotsArray[i].getRun(), robotsArray[i].getName())){
//                if (w.canJump(robotsArray[i].getJump(), robotsArray[i].getName())) {
//                    System.out.println(robotsArray[i].getName() + " успешно преодолел испытания");
//                }
//            }
//        }
    }
}
