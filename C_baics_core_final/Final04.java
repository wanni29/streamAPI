package C_baics_core_final;

import java.util.stream.IntStream;

public class Final04 {

    public static void main(String[] args) {

        IntStream stream1 = IntStream.of(30, 90, 70, 10);
        IntStream stream2 = IntStream.of(30, 90, 70, 10);
        IntStream stream3 = IntStream.of(30, 90, 70, 10);

        System.out.println(stream1.anyMatch(n -> n > 80));
        System.out.println(stream2.allMatch(n -> n > 80));
        System.out.println(stream3.noneMatch(n -> n > 100));

    }

}
