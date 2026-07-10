package src.Abstraction.Mini_project.main;

import src.Abstraction.Mini_project.bean.Student;
import src.Abstraction.Mini_project.exception.NullMarksArrayException;
import src.Abstraction.Mini_project.exception.NullNameException;
import src.Abstraction.Mini_project.exception.NullStudentObjectException;
import src.Abstraction.Mini_project.service.StudentReport;
import src.Abstraction.Mini_project.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    public StudentMain() {

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        StudentMain obj = new StudentMain();

        StudentReport report = new StudentReport();

        System.out.println("-D----- Student Report ------");

        for (Student student : data) {

            try {

                String result = report.validate(student);

                if (result.equals("VALID")) {

                    System.out.println(student.getName()
                            + " Grade : "
                            + report.findGrades(student));
                }

            } catch (NullStudentObjectException e) {

                System.out.println(e);

            } catch (NullNameException e) {

                System.out.println(e);

            } catch (NullMarksArrayException e) {

                System.out.println(e);
            }
        }

        StudentService service = new StudentService();

        System.out.println();

        System.out.println("Number of Null Marks Array : "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Number of Null Names : "
                + service.findNumberOfNullName(data));

        System.out.println("Number of Null Student Objects : "
                + service.findNumberOfNullObjects(data));
    }
}