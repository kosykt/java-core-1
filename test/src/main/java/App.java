import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class App {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("eee");
        list.add("fff");
        list.add("ggg");
        list.add("hhh");
        list.add("iii");
        list.add("jjj");
        list.add("aaa");

//        list.stream().sorted().filter(n  -> n.equals(n)).forEach(System.out::println);

        Set<String> set = new HashSet<>(list);

//        set.stream().forEach(System.out::println);

        list.stream().sorted()
                .filter(n -> "aaa".equals(n))
                .forEach(System.out::println);

    }
}
