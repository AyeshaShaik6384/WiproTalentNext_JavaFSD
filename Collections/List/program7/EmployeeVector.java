package Collections.List.program7;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

class Employee {

    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email,
             String gender, float salary) {

        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void getEmployeeDetails() {

        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Ayesha",
                "ayesha@gmail.com", "Female", 50000));

        employees.add(new Employee(102, "Rahul",
                "rahul@gmail.com", "Male", 65000));

        System.out.println("Using Iterator\n");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()) {
            itr.next().getEmployeeDetails();
            System.out.println("----------------------");
        }

        System.out.println("\nUsing Enumeration\n");

        Enumeration<Employee> en = employees.elements();

        while (en.hasMoreElements()) {
            en.nextElement().getEmployeeDetails();
            System.out.println("----------------------");
        }
    }
}