package Number_based;

import java.util.Scanner;

public class SumOfPowerOfDigits {

    public static int sumOfPowerOfDigits(int input1) {

        int sum = 0;
        int prev = 0;

        while (input1 > 0) {

            int digit = input1 % 10;

            sum += (int) Math.pow(digit, prev);

            prev = digit;

            input1 /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input1 = sc.nextInt();

        System.out.println("Answer = " + sumOfPowerOfDigits(input1));

        sc.close();
    }
}
