package B_basic_core_customizing;

import java.util.Arrays;
import java.util.stream.Stream;

public class Option02 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
        stream.map(s -> s.length()).forEach(System.out::println);
    }

}
