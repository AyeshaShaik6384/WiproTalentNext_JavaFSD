package Collections.Functional_Interface.Program4;

import java.util.*;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Ayesha",8000));
        list.add(new Employee(2,"Rahul",15000));
        list.add(new Employee(3,"Anu",9000));
        list.add(new Employee(4,"Ravi",20000));
        list.add(new Employee(5,"Priya",7000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        list.stream()
                .filter(p)
                .forEach(e -> System.out.println(e.getName()));
    }
}
