package Collections.Set.Program3;

import java.util.TreeSet;

import java.util.Iterator;

public class TreeSetDemo {
     public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("India");
        ts.add("USA");
        ts.add("Japan");
        ts.add("Australia");

        System.out.println("Reverse Order:");

        Iterator<String> desc = ts.descendingIterator();

        while (desc.hasNext()) {

            System.out.println(desc.next());
        }

        System.out.println("\nAscending Order:");

        Iterator<String> itr = ts.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        System.out.println();

        if (ts.contains("India")) {
            System.out.println("India Exists");
        } else {
            System.out.println("India Not Found");
        }
    }
}
