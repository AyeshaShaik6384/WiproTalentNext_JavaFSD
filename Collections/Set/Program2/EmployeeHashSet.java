package Collections.List.Set.Program2;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Ayesha");
        employees.add("Rahul");
        employees.add("Kiran");
        employees.add("Ravi");

        Iterator<String> itr = employees.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}
