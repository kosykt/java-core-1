package HW;

import java.util.Random;
import java.util.Scanner;

public class HW31 {

    public static void main(String[] args) {
        int ans = 1;
        game(ans);
    }

    public static void game(int p) {
        Scanner playernum = new Scanner(System.in);
        System.out.println("Введите число от 0 до 9");
        int pnum = playernum.nextInt();

        Random rand = new Random();
        int cnum = rand.nextInt(9);

        int trycount = 1;
        do {
            if (cnum > pnum){
                trycount += 1;
                System.out.println("Ваше число меньше");
            }else if (cnum < pnum) {
                trycount += 1;
                System.out.println("Ваше число больше");
            }else if (cnum == pnum) {
                System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет");
                Scanner play = new Scanner(System.in);
                int ans = play.nextInt();
                if (ans == 1){
                    game(ans);
                }
                break;
            }
            System.out.println("Введите другое число");
            pnum = playernum.nextInt();
        }while (trycount != 3);

        if (trycount == 3){
            System.out.println("Вы проиграли!");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет");
            Scanner play = new Scanner(System.in);
            int ans = play.nextInt();
            if (ans == 1){
                game(ans);
            }
        }
    }
}