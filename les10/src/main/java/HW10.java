import java.util.*;

public class HW10 {

    public static void main(String[] args) {
        List<String> myString = new ArrayList<>(19);

        myString.add("aaa");myString.add("bbb");myString.add("ccc");myString.add("ddd");myString.add("eee");
        myString.add("fff");myString.add("ggg");myString.add("hhh");myString.add("iii");myString.add("jjj");
        myString.add("WWW");myString.add("WWW");myString.add("WWW");myString.add("WWW");myString.add("WWW");myString.add("WWW");
        myString.add("XXX");myString.add("XXX");myString.add("XXX");

        numWords(myString);
        uniqWords(myString);
    }

    private static void numWords(List<String> myString) {
        Set<String> num = new HashSet<>(myString);
        for (String i : num) {
            System.out.println(i + " встречается: " + Collections.frequency(myString, i));
        }
    }

    private static void uniqWords(List<String> myString) {
        try {
            for (int i = 0; i < myString.size(); i++) {
                String strP = myString.get(i);
                String strN = myString.get(i + 1);
                if (strN == strP){
                    myString.remove(i);
                    i--;
                }
            }
        }catch (Exception e){ }
        System.out.println(myString);
    }
}
