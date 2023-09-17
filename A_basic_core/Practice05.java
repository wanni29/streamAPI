package A_basic_core;
import java.util.Random;
import java.util.stream.IntStream;

public class Practice05 {

    public static void main(String[] args) {
        IntStream stream = new Random().ints(4);
        stream.forEach(System.out::println);
    }

}
