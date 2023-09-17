package B_basic_core_customizing;

import java.util.Arrays;
import java.util.stream.Stream;

public class Option03 {

    public static void main(String[] args) {

        String[] arr = { "I study hard", "You study JAVA", "I am hungry" };

        Stream<String> stream1 = Arrays.stream(arr);
        stream1.flatMap(s -> Stream.of(s.split(" +"))).forEach(System.out::println);
    }

}
