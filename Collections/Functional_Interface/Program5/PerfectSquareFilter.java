package Collections.Functional_Interface.Program5;

import java.util.*;
import java.util.function.Predicate;

public class PerfectSquareFilter {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1,2,4,5,9,12,16,20,25,36));

        Predicate<Integer> p =
                n -> {
                    int r = (int)Math.sqrt(n);
                    return r*r==n;
                };

        list.stream()
                .filter(p)
                .forEach(System.out::println);
    }
}
