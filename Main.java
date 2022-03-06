import java.time.LocalTime;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        IntStream stream = IntStream.range(1, 10000);

        System.out.println(time);
        stream.forEach(text -> System.out.println(text));
    }
}
