package Collections.Stream_API.Program3;

import java.util.ArrayList;

public class StudentFilter {
     public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Ayesha", 75));
        list.add(new Student(2, "Rahul", 42));
        list.add(new Student(3, "Anu", 88));
        list.add(new Student(4, "Ravi", 55));
        list.add(new Student(5, "Priya", 35));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed: " + count);
    }
}
