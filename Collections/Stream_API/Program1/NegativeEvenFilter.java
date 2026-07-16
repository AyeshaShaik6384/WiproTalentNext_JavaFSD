package Collections.Stream_API.Program1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NegativeEvenFilter {
     public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(10, -2, -5, -8, 12, -14, 7, -18, 25));

        ArrayList<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);
    }
}
