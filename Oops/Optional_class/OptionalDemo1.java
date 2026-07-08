import java.util.Optional;

public class OptionalDemo1 {

    public static void main(String[] args) {

        String name = "Wipro";

        Optional<String> optional = Optional.ofNullable(name);

        if (optional.isPresent()) {
            System.out.println("Value Present");
            System.out.println("Value : " + optional.get());
        } else {
            System.out.println("Value Not Present");
        }
    }
}