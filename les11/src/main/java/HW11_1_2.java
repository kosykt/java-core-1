import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HW11_1_2 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        wh11_1(arr);
        wh11_2(arr);
    }

    private static void wh11_1(Integer[] arr) {
        arr[0] ^= arr[1];
        arr[1] ^= arr[0];
        arr[0] ^= arr[1];
        System.out.println(Arrays.toString(arr));
    }

    private static void wh11_2(Integer[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
