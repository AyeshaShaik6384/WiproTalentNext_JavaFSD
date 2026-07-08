import java.util.Optional;

public class OptionalDemo3 {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optional = Optional.ofNullable(name);

        try {
            String result = optional.orElseThrow(
                    () -> new RuntimeException("Value is not Present"));

            System.out.println(result);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}