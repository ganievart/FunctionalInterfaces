import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<Integer> printer = System.out::println;
        printer.accept(100);

    }
}
