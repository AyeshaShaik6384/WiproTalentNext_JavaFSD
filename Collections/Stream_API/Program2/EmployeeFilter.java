package Collections.Stream_API.Program2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class EmployeeFilter {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Ayesha", 21, "Pune"));
        list.add(new Employee(102, "Rahul", 23, "Hyderabad"));
        list.add(new Employee(103, "Anu", 22, "Pune"));
        list.add(new Employee(104, "Ravi", 24, "Chennai"));
        list.add(new Employee(105, "Priya", 20, "Pune"));

        ArrayList<Employee> puneEmployees = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toCollection(ArrayList::new));

        puneEmployees.forEach(System.out::println);
    }
}
