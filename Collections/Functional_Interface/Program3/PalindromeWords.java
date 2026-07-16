package Collections.Functional_Interface.Program3;

import java.util.*;
import java.util.function.Predicate;

public class PalindromeWords {
     public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(
                Arrays.asList("madam","java","level","hello","radar",
                        "apple","noon","code","rotator","world"));

        Predicate<String> p =
                s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());

        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}
