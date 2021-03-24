import java.util.*;

public class HW10 {

    public static void main(String[] args) {
        List<String> myString = new ArrayList<>(16);

        myString.add("aaa");myString.add("bbb");myString.add("ccc");myString.add("ddd");myString.add("eee");
        myString.add("fff");myString.add("ggg");myString.add("hhh");myString.add("iii");myString.add("jjj");

        myString.add("WWW");myString.add("WWW");myString.add("WWW");

        myString.add("XXX");myString.add("XXX");myString.add("XXX");



        Iterator<String> iter = myString.iterator();
        ListIterator<String> listIter = myString.listIterator();
        //вариант 1
        while (iter.hasNext()){
            System.out.println(1);
        }
        //вариант 2
        while (listIter.hasPrevious()){
            System.out.println(2);
        }
        //вариант 3
        while (iter.hasNext()){
            String str = iter.next();
            if (str.equals("aaa")) {
                iter.remove();
            }
        }
        //вариант 4
        while (listIter.hasNext()){
            String str = listIter.previous();
            if (str.equals("bbb")){
                iter.remove();
            }
        }

        System.out.println(myString);
    }
}
