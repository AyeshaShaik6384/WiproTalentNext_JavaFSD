package Collections.List.program2;

public class TestEmployee {
    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(
                101,
                "Ayesha",
                "ayesha@gmail.com",
                "Female",
                50000);

        Employee e2 = new Employee(
                102,
                "Rahul",
                "rahul@gmail.com",
                "Male",
                65000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("Employee Details");
        db.showAllEmployees();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");
        db.showAllEmployees();
    }
}
