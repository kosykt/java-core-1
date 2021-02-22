import java.util.Arrays;
public class Les2 {

    public static void main(String[] args) {

        //HW 2.1
        System.out.println("HW 2.1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < 10; ++i){
            if ( arr1[i] == 0){
                arr1[i] = 1;
            }else {
                arr1[i] = 0;
            }
        }

        System.out.println(Arrays.toString(arr1));

        //HW 2.2
        System.out.println("HW 2.2");

        int[] arr2 = new int[8];
        int num = 0;

        for (int i = 0; i < 8; ++i){
            if (i == 0){
                arr2[i] = num;
            } else {
                arr2[i] = num + 3;
                num += 3;
            }
        }

        System.out.println(Arrays.toString(arr2));

        //HW 2.3
        System.out.println("HW 2.3");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr3.length; ++i){
            if (arr3[i] < 6){
                arr3[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr3));

        //HW 2.4
        System.out.println("HW 2.4");

        int[][] arr4 = new int[9][9];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j || i + j == arr4.length - 1){
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
                System.out.print(arr4[i][j] + " ");
            }

            System.out.println("");
        }

        //HW 2.5
        System.out.println("HW 2.5");

        int[] arr5 = {9, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 7};
        int min = arr5[0];
        int max = arr5[0];

        for (int i = 0; i < arr5.length; i++){
            if (arr5[i] > max){
                max = arr5[i];
            }
            if (arr5[i] < min){
                min = arr5[i];
            }
        }

        System.out.println("Максимальное число = " + max);
        System.out.println("Минимальное число = " + min);

        //HW 2.6

        int[] arr6 = {2, 2, 2, 6};
        int[] check1 = new int[arr6.length];
        int[] check2 = new int[arr6.length];
        int number = arr6.length;

        for (int i = 0; i < arr6.length; i++){
            while (true){
                check1[i] = arr6[i];

            }
        }

    }

}
