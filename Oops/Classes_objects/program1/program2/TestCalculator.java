public class TestCalculator {

    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Please enter 4 values.");
            return;
        }

        int intNum = Integer.parseInt(args[0]);
        int intPower = Integer.parseInt(args[1]);

        double doubleNum = Double.parseDouble(args[2]);
        int doublePower = Integer.parseInt(args[3]);

        System.out.println("powerInt = " +
                Calculator.powerInt(intNum, intPower));

        System.out.println("powerDouble = " +
                Calculator.powerDouble(doubleNum, doublePower));
    }
}