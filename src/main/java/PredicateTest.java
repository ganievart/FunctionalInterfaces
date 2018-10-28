import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = x-> x >0;

        System.out.println(isPositive.test(10));
    }
}
