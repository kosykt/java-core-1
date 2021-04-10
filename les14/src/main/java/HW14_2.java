public class HW14_2 {

    public static void main(String[] args) {
        HW14_2 hw = new HW14_2();

        int[] arr = {1, 2, 3, 5};

        System.out.println(hw.check(arr));
    }

    public boolean check(int[] arr) {
        boolean x = false,
                y = false,
                z = false;

        for (int i: arr) {
            if(i == 1){
                x = true;
            }else if (i == 4){
                y = true;
            }
        }
        if (x == true && y == true){
            z = true;
        }
        return z;
    }
}
