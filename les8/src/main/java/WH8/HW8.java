package WH8;

public class HW8 {
    static Obstacle[] obstaclArray = new Obstacle[2];
    static Competitors[] competitorsArray = new Competitors[3];
    static AbstractLane[] abstractLanesArray = new AbstractLane[2];


    public static void main(String[] args) {
        competitorsArray[0] = new Human("Henry", 100, 10);
        competitorsArray[1] = new Cat("Barsik", 100, 10);
        competitorsArray[2] = new Robot("R2D2", 300,30);

        abstractLanesArray[0] = new Treadmill(150);
        abstractLanesArray[1] = new Wall(15);

        abstractLanesArray[0].trying(competitorsArray[0].getRun(), competitorsArray[0].getJump(), competitorsArray[0].getName());
    }
}
