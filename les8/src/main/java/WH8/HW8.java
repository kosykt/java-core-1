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

        for (int i = 0; i < competitorsArray.length; i++) {
            if (obstacleСourseArray[0].trying(competitorsArray[i].getRun(), competitorsArray[i].getName())){
                if (obstacleСourseArray[1].trying(competitorsArray[i].getJump(), competitorsArray[i].getName())){
                    System.out.println(competitorsArray[i].getName() + " выполнил все упражнения");
                }
            }
        }

    }
}
