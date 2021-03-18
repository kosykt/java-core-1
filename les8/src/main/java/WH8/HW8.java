package WH8;

public class HW8 {
    static Competitors[] competitorsArray = new Competitors[3];
    static ObstacleСourse[] obstacleСourseArray = new ObstacleСourse[2];


    public static void main(String[] args) {
        competitorsArray[0] = new Human("Henry", 200, 10);
        competitorsArray[1] = new Cat("Barsik", 100, 10);
        competitorsArray[2] = new Robot("R2D2", 300,30);

        obstacleСourseArray[0] = new Treadmill(150);
        obstacleСourseArray[1] = new Wall(15);

        boolean x, y;
        x = obstacleСourseArray[0].trying(competitorsArray[0].getRun(), competitorsArray[0].getName());
        y = obstacleСourseArray[1].trying(competitorsArray[0].getJump(), competitorsArray[0].getName());
        System.out.println(x + " " + y);

    }
}
