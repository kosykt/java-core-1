package HW7;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plate plate = new Plate(10);

        Cat[] catsArray = new Cat[5];
        catsArray[0] = new Cat("Barsik", 1, false);
        catsArray[1] = new Cat("Bobik", 2, false);
        catsArray[2] = new Cat("Murzik", 3, false);
        catsArray[3] = new Cat("Pushok", 4, false);
        catsArray[4] = new Cat("Gav", 5, false);

        for (int i = 0; i < catsArray.length; i++) {
            plate.info();
            catsArray[i].eat(plate);
            catsArray[i].isFullness();
            if (Plate.getFood() == 0){
                System.out.println("Введите количество еды, которое хотите добавить:");
                int addFood = sc.nextInt();
                Plate.setFood(addFood);
            }
        }
    }
}

