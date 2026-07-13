//package Logic_building.Day-8;

public class EvenOddDigitsSum {
    public static int evenOddDigitsSum(int n, String option) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (option.equalsIgnoreCase("even")) {

                if (digit % 2 == 0)
                    sum += digit;

            } else if (option.equalsIgnoreCase("odd")) {

                if (digit % 2 != 0)
                    sum += digit;
            }

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(evenOddDigitsSum(9625, "odd"));
        System.out.println(evenOddDigitsSum(2134, "even"));
    }
}
