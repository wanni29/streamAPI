package C_baics_core_final;

import java.util.stream.Stream;

public class Final01 {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("넷", "둘", "셋", "하나");
        stream.forEach(System.out::println);
    }

}
