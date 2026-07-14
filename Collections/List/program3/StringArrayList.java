package Collections.List.program3;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("ArrayList Elements:");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
