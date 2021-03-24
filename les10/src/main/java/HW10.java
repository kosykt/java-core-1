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

        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals("aaa")) {
                iterator.remove();
            }
        }

        System.out.println(s);
    }
}
