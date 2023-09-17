package A_basic_core;
import java.util.stream.Stream;

public class Practice03 {

    public static void main(String[] args) {
        Stream<Double> stream = Stream.of(4.2, 2.5, 3.1, 1.9);
        // stream.forEach(e -> System.out.print(e + " "));
        stream.forEach(System.out::println);

    }
    
}
