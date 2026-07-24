package Number_based;
import java.util.Scanner;

public class SumOfSumsOfDigits {

    public static int sumOfSumsOfDigits(int input1) {

        String str = String.valueOf(input1);

        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            total += str.charAt(i) - '0';
        }

        int ans = 0;

        for (int i = 0; i < str.length(); i++) {

            ans += total;

            total -= (str.charAt(i) - '0');
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int input1 = sc.nextInt();

        System.out.println("Answer = " + sumOfSumsOfDigits(input1));

        sc.close();
    }
}
