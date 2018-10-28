import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<String> factory = () -> {
            return "Supplier Test";
        };

        System.out.println(factory.get());

    }

}
