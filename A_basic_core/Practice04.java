package A_basic_core;
import java.util.stream.IntStream;

public class Practice04 {

    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(1, 4);
        stream1.forEach(e -> System.out.println(e + ""));
        System.out.println();

        IntStream stream2 = IntStream.rangeClosed(1, 4);
        stream2.forEach(e -> System.out.println(e + ""));
    }
}
