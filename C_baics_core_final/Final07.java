package C_baics_core_final;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Final07 {

    public static void main(String[] args) {
        Stream<String> stream  = Stream.of("넷", "둘", "하나", "셋");
        List<String> list = stream.collect(Collectors.toList());
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

}
