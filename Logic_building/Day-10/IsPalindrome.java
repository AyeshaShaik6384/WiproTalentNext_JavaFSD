//package Logic_building.Day-10;

public class IsPalindrome {
    public static int isPalindrome(String input1) {

        input1 = input1.toLowerCase();

        int i = 0;
        int j = input1.length() - 1;

        while (i < j) {

            if (input1.charAt(i) != input1.charAt(j))
                return 1;

            i++;
            j--;
        }

        return 2;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("Madam"));
        System.out.println(isPalindrome("Hello"));
    }
}
