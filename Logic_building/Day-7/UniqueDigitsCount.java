//package Logic_building.Day-7;

public class UniqueDigitsCount {

    public static int uniqueDigitsCount(int n) {

        boolean[] seen = new boolean[10];
        int count = 0;

        while (n > 0) {

            int digit = n % 10;

            if (!seen[digit]) {
                seen[digit] = true;
                count++;
            }

            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(uniqueDigitsCount(292));
        System.out.println(uniqueDigitsCount(1015));
    }
}