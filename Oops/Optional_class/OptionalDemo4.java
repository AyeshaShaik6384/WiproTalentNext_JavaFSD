import java.util.Optional;

public class OptionalDemo4 {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Welcome to Wipro");

        optional.ifPresent(System.out::println);
    }
}