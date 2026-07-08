import java.util.Optional;

public class OptionalDemo2 {

    public static void main(String[] args) {

        String name = null;

        Optional<String> optional = Optional.ofNullable(name);

        String result = optional.orElse("Default Value");

        System.out.println(result);
    }
}