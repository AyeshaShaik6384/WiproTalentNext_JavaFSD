package IOOperations.Mini_Project;

import java.io.*;
import java.util.ArrayList;

public class EmployeeDAO {

    private static final String FILE = "employee.dat";

    public void addEmployee(Employee emp) {

        ArrayList<Employee> list = getAllEmployees();

        list.add(emp);

        try {

            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(FILE));

            out.writeObject(list);

            out.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayList<Employee> getAllEmployees() {

        ArrayList<Employee> list = new ArrayList<>();

        File file = new File(FILE);

        if (!file.exists())
            return list;

        try {

            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream(FILE));

            list = (ArrayList<Employee>) in.readObject();

            in.close();

        } catch (Exception e) {

            System.out.println(e);
        }

        return list;
    }
}