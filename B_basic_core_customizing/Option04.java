package B_basic_core_customizing;

import java.util.stream.IntStream;

public class Option04 {

    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(0, 10);
        IntStream stream2 = IntStream.range(0, 10);
        IntStream stream3 = IntStream.range(0, 10);

        stream1.skip(4).forEach(n -> System.out.print(n + " "));
        System.out.println();

        stream2.limit(5).forEach(n -> System.out.print(n + " "));
        System.out.println();

        stream3.skip(3).forEach(n -> System.out.print(n + " "));
    }

}
