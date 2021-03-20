public class HW9 {

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
                throw new MyArraySizeException();
            }
        }

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
    }
}
