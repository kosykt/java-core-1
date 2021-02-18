import java.util.Scanner;

public class Lesson1 {

    public static void main(String[] args) { // HW 1.1

        // HW 1.2

        byte byt = 123;
        short sho = 1234;
        int in = 12345;
        long lon = 123456;

        float flo = 1.2f;
        double dou = 1.23;
        char cha = 'c';
        boolean boo = true;

        // HW 1.3

        float a = 1.0f;
        float b = 2.0f;
        float c = 3.0f;
        float d = 4.0f;
        float e = a * (b + (c / d));

        System.out.println("a * (b + (c / d)) = " + e);

        // HW 1.4

        int num1 = 10;
        int num2 = 5;

        if ( 10 <= num1 + num2 && num1 + num2 <= 20 ){

            System.out.println("true");

        }else {

            System.out.println("false");

        }

        // HW 1.5

        if ( num1 >= 0 ){

            System.out.println(num1 + " положительное число");

        }else {

            System.out.println(num2 + " отрицательное число");

        }

        // HW 1.6

        if ( num2 >= 0 ){

            System.out.println("false");

        }else {

            System.out.println("true");

        }

        // HW 1.7

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // HW 1.8

        int year = 2021;

         if (year % 400 == 0){

             System.out.println(year + " не високосный");

         } else if (year % 100 == 0 || year % 4 == 0){

            System.out.println(year + " високосный");

         } else {

             System.out.println(year + " не високосный");

         }

    }

}


