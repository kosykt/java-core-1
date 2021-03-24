import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HW10 {

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>(16);

        s.add("aaa");s.add("bbb");s.add("ccc");s.add("ddd");s.add("eee");
        s.add("fff");s.add("ggg");s.add("hhh");s.add("iii");s.add("jjj");

        s.add("WWW");s.add("WWW");s.add("WWW");

        s.add("XXX");s.add("XXX");s.add("XXX");

        System.out.println(s);

        String[] arr = new String[s.size()];
        s.toArray(arr);

        System.out.println(Arrays.toString(arr));



    }
}
