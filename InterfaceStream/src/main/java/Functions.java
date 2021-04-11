import java.util.function.*;

public class Functions {

    public static void main(String[] args) {
        Function<Integer, String> weekDay = i -> {
            switch (i) {
                case 1:
                    return "Пн";
                case 2:
                    return "Вт";
                case 3:
                    return "Ср";
                case 4:
                    return "Чт";
                case 5:
                    return "Пт";
                case 6:
                    return "Сб";
                default:
                    return "Вс";
            }
        };

        BiFunction<String, String, Integer> lenStr = (s, s2) -> s.length() + s2.length();

        Predicate<Integer> isOven = i -> i % 2 == 0;

        Supplier<Integer> supplier = () -> 42;

        Consumer<Integer> print = System.out::println;

        print.accept(1);
    }
}
