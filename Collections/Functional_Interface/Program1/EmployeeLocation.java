package Collections.Functional_Interface.Program1;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {
     public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Ayesha","Guntur",35000));
        list.add(new Employee(2,"Anu","Hyderabad",42000));
        list.add(new Employee(3,"Rahul","Pune",30000));
        list.add(new Employee(4,"Ravi","Chennai",50000));
        list.add(new Employee(5,"Priya","Delhi",45000));

        Function<Employee,String> fun = Employee::getLocation;

        ArrayList<String> locations = new ArrayList<>();

        list.forEach(e -> locations.add(fun.apply(e)));

        System.out.println(locations);
    }
}
