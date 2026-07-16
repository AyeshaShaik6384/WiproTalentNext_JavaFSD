package Collections.Lambda_Expressions.Program3;

import java.util.ArrayList;

public class OddLengthStringsLambda {
    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Apple");
        a1.add("Banana");
        a1.add("Cat");
        a1.add("Dog");
        a1.add("Elephant");
        a1.add("Fish");
        a1.add("Goat");
        a1.add("Hat");
        a1.add("Ink");
        a1.add("Java");

        a1.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(System.out::println);
    }
}
