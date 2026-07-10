package src.Abstraction.Mini_project.service;

import src.Abstraction.Mini_project.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student != null && student.getMarks() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullName(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student != null && student.getName() == null) {
                count++;
            }
        }

        return count;
    }

    public int findNumberOfNullObjects(Student[] students) {

        int count = 0;

        for (Student student : students) {

            if (student == null) {
                count++;
            }
        }

        return count;
    }
}