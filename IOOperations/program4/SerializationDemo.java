package IOOperations.program4;

import java.io.*;
import java.util.Date;

public class SerializationDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Ayesha",
                new Date(),
                "CSE",
                "Developer",
                50000);

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream("data"));

            out.writeObject(emp);

            out.close();

            System.out.println("Object Serialized.");

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream("data"));

            Employee e = (Employee) in.readObject();

            in.close();

            System.out.println();

            System.out.println("Object Deserialized");

            System.out.println(e);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}