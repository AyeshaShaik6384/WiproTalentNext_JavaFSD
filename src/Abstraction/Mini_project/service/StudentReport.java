package src.Abstraction.Mini_project.service;

import src.Abstraction.Mini_project.bean.Student;
import src.Abstraction.Mini_project.exception.NullMarksArrayException;
import src.Abstraction.Mini_project.exception.NullNameException;
import src.Abstraction.Mini_project.exception.NullStudentObjectException;

public class StudentReport {

    public String validate(Student student)
            throws NullNameException,
                   NullMarksArrayException,
                   NullStudentObjectException {

        if (student == null) {
            throw new NullStudentObjectException();
        }

        if (student.getName() == null) {
            throw new NullNameException();
        }

        if (student.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }

    public String findGrades(Student student) {

        int[] marks = student.getMarks();

        int total = 0;

        for (int mark : marks) {

            if (mark < 35) {
                student.setGrade("F");
                return "F";
            }

            total += mark;
        }

        if (total >= 250)
            student.setGrade("A+");
        else if (total >= 200)
            student.setGrade("A");
        else if (total >= 150)
            student.setGrade("B");
        else
            student.setGrade("C");

        return student.getGrade();
    }
}