package src.Abstraction.ExceptionHandling.program1;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int c = a / b;

            System.out.println("Result = " + c);

        } catch (ArithmeticException e) {

            System.out.println("Division by zero is not possible.");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please pass two integer arguments.");

        } catch (NumberFormatException e) {

            System.out.println("Please enter only integers.");

        } finally {

            System.out.println("Program Ended.");
        }
    }
}