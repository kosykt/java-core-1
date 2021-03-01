package HW;

import java.util.Random;
import java.util.Scanner;

public class HW32 {
    public static void main(String[] args) {
        gameHW32();
    }

    public static void gameHW32 (){
        int success = 0;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int wordnum = random.nextInt(words.length);
        String compchoice = words[wordnum];
        char[] x = compchoice.toCharArray();

        do {
            System.out.println("Введите слово");
            Scanner playerword = new Scanner(System.in);
            String playchoice = playerword.next();
            char[] y = playchoice.toCharArray();

            if (compchoice.equals(playchoice)){
                System.out.println("Поздравляю вы победили");
                success ++;
            }else {
                for (char i = 0; i < x.length; i++){
                    if(x[i] == y[i]){
                        System.out.print(x[i]);
                    } else {
                        System.out.println("#############");
                        break;
                    }
                }
            }
        }while (success != 1);
    }
}
