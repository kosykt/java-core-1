import java.util.Scanner;

public class HW32 {

    public static void main(String[] args) {
        HW32 counter = new HW32();
        Scanner player = new Scanner(System.in);
        String playerword = player.next();
        int[] charplayerword = count(playerword);
        for (char i= 0; i < charplayerword.length; i++){
            if (charplayerword[i] != 0) {
                System.out.println(i + " встретилось " + charplayerword[i] + " раза");
            }
        }
        }
        
//        int[] chars = counter.count("aaazAz1b11bb4bAz");
//        for (char i = 0; i < chars.length; i++) {
//            if (chars[i] != 0) {
//                System.out.println(i + " встретилось " + chars[i] + " раза");
//            }
//        }
    }

    public static int[] count(String sentence) {
        int[] c = new int[127];
        char[] chars = sentence.toCharArray();
        for (char ch : chars) {
            c[ch]++;
        }
        return c;
    }
}
