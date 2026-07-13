//package Logic_building.Day-8;

public class OddDigitsSum {
     public static int oddDigitsSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit % 2 != 0)
                sum += digit;

            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(oddDigitsSum(9625));
        System.out.println(oddDigitsSum(2134));
    }
}
