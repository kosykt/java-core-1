import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static char[][] map;
    public static int size = 3;
    public static int dotstowin = 3;
    public static char emptydot = '*';
    public static char player = 'X';
    public static char computer = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Scanner sizescan = new Scanner(System.in);
    public static Scanner dotstowinscan = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        do{
            System.out.println("Введите размеры поля");
            size = sizescan.nextInt();
            System.out.println("Введите колличество фишек для победы");
            dotstowin = dotstowinscan.nextInt();
            if (size < dotstowin){
                System.out.println("Колличество фишек для победы должно быть меньше либо равно размера поля");
            }else {
                break;
            }

        }while (true);
        initgamemap();
        printgamemap();
        while (true) {
            humanTurn();
            printgamemap();
            if (checkWin(player)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printgamemap();
            if (checkWin(computer)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }


    public static void initgamemap(){
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = emptydot;
            }
        }
    }

    public static void printgamemap() {
        for (int i = 0; i <= size; i++) {
            if (i == 0){
                System.out.print('¤' + " ");
            }else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = player;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        return map[y][x] == emptydot;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = computer;
    }

    public static boolean checkWin(char symb) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symb){
                    int ch = 1;
                    int dot = 1;
                    do {
                        if (j + ch > size - 1){
                            break;
                        }
                        if (map[i][j] == map[i][j+ch]){
                            ch++;
                        }
                        if (ch == dotstowin){
                            return true;
                        }
                        dot++;
                    }while (dot != size);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symb){
                    int ch = 1;
                    int dot = 1;
                    do {
                        if (i + ch > size - 1){
                            break;
                        }
                        if (map[i][j] == map[i+ch][j]){
                            ch++;
                        }
                        if (ch == dotstowin){
                            return true;
                        }
                        dot++;
                    }while (dot != size);
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symb){
                    int ch = 1;
                    int dot = 1;
                    do {
                        if (i + ch > size - 1){
                            break;
                        }
                        if (j + ch > size - 1){
                            break;
                        }
                        if (map[i][j] == map[i+ch][j+ch]){
                            ch++;
                        }
                        if (ch == dotstowin){
                            return true;
                        }
                        dot++;
                    }while (dot != size);

                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symb){
                    int ch = 1;
                    int dot = 1;
                    do {
                        if (i - ch < 0){
                            break;
                        }
                        if (j + ch > size - 1){
                            break;
                        }
                        if (map[i][j] == map[i-ch][j+ch]){
                            ch++;
                        }
                        if (ch == dotstowin){
                            return true;
                        }
                        dot++;
                    }while (dot != size);
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == emptydot) return false;
            }
        }
        return true;
    }
}
