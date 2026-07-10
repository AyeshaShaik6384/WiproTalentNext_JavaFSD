package src.Abstraction.ExceptionHandling.program3;

public class Student {

    public static void main(String[] args) {

        String name = "Ayesha";
        int rollNo = 101;

        int mark1 = 85;
        int mark2 = 92;
        int mark3 = 78;

        try {

            if (mark1 < 0 || mark2 < 0 || mark3 < 0) {
                throw new NegativeValueException("Marks cannot be negative.");
            }

            if (mark1 > 100 || mark2 > 100 || mark3 > 100) {
                throw new OutOfRangeException("Marks should be between 0 and 100.");
            }

            double average = (mark1 + mark2 + mark3) / 3.0;

            System.out.println("Name : " + name);
            System.out.println("Roll No : " + rollNo);
            System.out.println("Average Marks : " + average);

        } catch (NegativeValueException e) {

            System.out.println(e.getMessage());

        } catch (OutOfRangeException e) {

            System.out.println(e.getMessage());
        }
    }
}