import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        Function<Integer, String> text = x-> String.valueOf(x) + '$';

        System.out.println(text.apply(3));
    }
}
