import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        Collection<Integer> ints = Arrays.asList(1, 2, 5, 10, 29, 84);
        Stream<Integer> stream = ints.stream();

        int[] ints1 = {1, 2, 5, 10, 29, 84};
        IntStream stream1 = Arrays.stream(ints1);

        Stream<Double> random = Stream.generate(Math::random); // генератор случайных чисел

        Stream<String> build = Stream.<String>builder().add("One").add("Two").add("Three").build();

        IntStream range = IntStream.range(1, 10);

        IntStream intStream = new Random().ints(10, 0, 11);

        LongStream iterate = Stream.iterate( // {1, 0}, {1, 1}, {2, 1}, {3, 2}, {5, 3}, {8, 5} - числа фибоначи
                new long[]{1, 0},
                f -> new long[]{f[0] + f[1], f[0]}
        ).mapToLong(f -> f[0]) // принимает f т.е. long{1, 0}, возвращает только f[0] т.е. 1,1,2,3,5,8 и т.д
                .limit(10); // первые десять чисел
    }
}
