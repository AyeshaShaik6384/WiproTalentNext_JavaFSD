//package Logic_building.Day-9;

public class IsPalindromeNumber {
    public static int isPalindromeNumber(int input1) {

        int original = input1;
        int reverse = 0;

        while (input1 > 0) {

            int digit = input1 % 10;
            reverse = reverse * 10 + digit;
            input1 /= 10;
        }

        if (original == reverse)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        System.out.println(isPalindromeNumber(121));
        System.out.println(isPalindromeNumber(123));
    }
}
