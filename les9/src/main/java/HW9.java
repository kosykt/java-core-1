public class HW9 {

<<<<<<< HEAD
    public static void main(String[] args){
        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                          {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        
        try {
            try {
                int summ = checkMyArray(arr);
                System.out.println(summ);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static int checkMyArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4){
            System.out.println("не верное количество внутренних одномерных массивов");
            throw new MyArraySizeException();
        }

        for (int i = 0; i < 4; i++) {
            if (arr[i].length != 4){
                System.out.printf("не верное колличество ячеек в %d-м внутреннем массиве", i);
=======
    public static void main(String[] args) throws MyArraySizeException {
        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                          {"9", "10", "11", "12"}, {"13", "14", "15", "16", "1"}};

        if (arr.length != 4){
            System.out.println("не верная длина массива");
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i].length != 4){
                System.out.println("не верное колличество ячеек");
>>>>>>> main
                throw new MyArraySizeException();
            }
        }

<<<<<<< HEAD
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.printf("не верное наполнение ячееки [%d][%d]", i, j);
                    throw new MyArrayDataException();
                }
            }
        }

        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                summ += Integer.parseInt(arr[i][j]);
            }
        }

        return summ;
=======
//        try {
//            summArr(arr);
//        }catch (MyArraySizeException e){
//            System.out.println("не верная длина массива");
//        }
//        try {
//
//        }catch (MyArrayDataException e){
//            System.out.println("ошибка преобразования");
//        }
//    }
//
//    public static void summArr(String[][] array){
//        if (array.length != 4){
//            throw MyArraySizeException;
//        }
>>>>>>> main
    }
}
