public class HW14_1 {

    public static void main(String[] args) {
        HW14_1 hw = new HW14_1();
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(hw.checkArr(arr));
    }

    public int[] checkArr(int[] arr) {
        int x = 0;
        int [] result = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                x = arr[i];
                result = new int[arr.length - i - 1];
                for (int j = i + 1, m = 0; j < arr.length; j++, m++) {
                    if (arr[j] == 4) continue;
                    result[m] = arr[j];
                }
            }
        }
        try{
            x = 1 / x;
        } catch(ArithmeticException e){
            throw new RuntimeException();
        }
        return result;
    }
}
