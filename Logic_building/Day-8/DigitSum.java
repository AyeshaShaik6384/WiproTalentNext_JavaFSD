//package Logic_building.Day-8;

public class DigitSum {
    public static int digitSum(int n) {

        boolean negative = false;

        if (n < 0) {
            negative = true;
            n = -n;
        }

        while (n >= 10) {

            int sum = 0;

            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }

            n = sum;
        }

        if (negative)
            return -n;

        return n;
    }

    public static void main(String[] args) {

        System.out.println(digitSum(976592));
        System.out.println(digitSum(123456));
        System.out.println(digitSum(-123456));
    }
}
