package Wrapper_Classes.program4;

public class TestEmployee {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Ayesha", 50000);

        Employee e2 = (Employee) e1.clone();

        e1.name = "Rahul";
        e1.salary = 65000;

        System.out.println("Original Employee");
        e1.display();

        System.out.println();

        System.out.println("Cloned Employee");
        e2.display();
    }
}