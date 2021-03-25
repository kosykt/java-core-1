import java.util.*;

public class HW10_1 {

    public static void main(String[] args) {
        List<String> myString = new ArrayList<>(19);

        myString.add("VVV");myString.add("VVV");myString.add("VVV");myString.add("VVV");myString.add("VVV");
        myString.add("aaa");myString.add("bbb");myString.add("ccc");myString.add("ddd");myString.add("eee");
        myString.add("fff");myString.add("ggg");myString.add("hhh");myString.add("iii");myString.add("jjj");
        myString.add("WWW");myString.add("WWW");myString.add("WWW");myString.add("WWW");myString.add("WWW");

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
        Set<String> uniq = new HashSet<>();
        Set<String> notUniq = new HashSet<>();
        myString.stream().forEach(s -> {
            if (!notUniq.contains(s)) {
                if (uniq.contains(s)) {
                    uniq.remove(s);
                    notUniq.add(s);
                } else {
                    uniq.add(s);
                }
            }
        });
        System.out.println(uniq);
    }
}
