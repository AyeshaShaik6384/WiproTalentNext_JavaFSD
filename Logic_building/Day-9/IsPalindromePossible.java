//package Logic_building.Day-9;

public class IsPalindromePossible {
    public static int isPalindromePossible(int input1) {

        int[] freq = new int[10];

        while (input1 > 0) {

            freq[input1 % 10]++;
            input1 /= 10;
        }

        int odd = 0;

        for (int i = 0; i < 10; i++) {

            if (freq[i] % 2 != 0)
                odd++;
        }

        return (odd <= 1) ? 2 : 1;
    }

    public static void main(String[] args) {

        System.out.println(isPalindromePossible(21251));
        System.out.println(isPalindromePossible(2125));
    }
}
