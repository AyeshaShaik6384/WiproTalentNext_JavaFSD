package Collections.Functional_Interface.Program7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEvenConsumer {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(2,5,8,11,14,17,20,23,26,29));

        Consumer<Integer> c =
                n -> System.out.println(n + " " + (n%2==0 ? "even" : "odd"));

        list.forEach(c);
    }
}
