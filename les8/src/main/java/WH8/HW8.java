package WH8;

public class HW8 {
    static Competitors[] competitorsArray = new Competitors[3];
//    static AbstractLane[] abstractLanesArray = new AbstractLane[2];
    static ObstacleСourse[] obstacleСourseArray = new ObstacleСourse[2];


    public static void main(String[] args) {
        competitorsArray[0] = new Human("Henry", 200, 10);
        competitorsArray[1] = new Cat("Barsik", 100, 10);
        competitorsArray[2] = new Robot("R2D2", 300,30);

        obstacleСourseArray[0] = new Treadmill(150);
        obstacleСourseArray[1] = new Wall(15);

        int x, y;
        x = obstacleСourseArray[0].getValue();
        y = obstacleСourseArray[1].getValue();
        System.out.println(x + " " + y);

//        for (int i = 0; i < competitorsArray.length; i++) {
//            abstractLanesArray[0].trying(competitorsArray[i].getRun(), competitorsArray[i].getJump(), competitorsArray[i].getName());
//        }

    }
}
