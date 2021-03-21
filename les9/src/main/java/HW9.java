public class HW9 {

    public static void main(String[] args){
        String[][] arr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"},
                          {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            checkMyArraySizeException(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            checkMyArrayDataException(arr);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

//        System.out.println(summArray(arr));
    }

    private static void checkMyArraySizeException(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4){
            System.out.println("не верная длина массива");
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i].length != 4){
                System.out.println("не верное колличество ячеек");
                throw new MyArraySizeException();
            }
        }

    }

    private static void checkMyArrayDataException(String[][] arr) throws MyArrayDataException {
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
    }

    private static int summArray(String[][] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                   summ += Integer.parseInt(array[i][j]);
            }
        }
        return summ;
    }
}
