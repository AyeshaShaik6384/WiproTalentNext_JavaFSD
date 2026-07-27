package String_Based;

public class AdditionUsingStrings {

    public static String addStrings(String input1, String input2) {

        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0)
                sum += input1.charAt(i--) - '0';

            if (j >= 0)
                sum += input2.charAt(j--) - '0';

            ans.append(sum % 10);
            carry = sum / 10;
        }

        return ans.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(addStrings("1234", "56"));

        System.out.println(addStrings("56", "1234"));

        System.out.println(addStrings(
                "123456732128989543219",
                "987612673489652"));

    }
}