package src.Abstraction.ExceptionHandling.program2;

public class MathOperation {

    public static void main(String[] args) {

        try {

            if (args.length != 5) {
                throw new IllegalArgumentException();
            }

            int sum = 0;

            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }

            double avg = (double) sum / 5;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);

        } catch (NumberFormatException e) {

            System.out.println("Only integers are allowed.");

        } catch (IllegalArgumentException e) {

            System.out.println("Please enter exactly 5 integers.");
        }
    }
}