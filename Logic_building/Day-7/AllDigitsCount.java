//package Logic_building.Day-7;

public class AllDigitsCount {

    public static int allDigitsCount(int n) {

        int count = 0;

        while (n > 0) {

            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(allDigitsCount(292));
        System.out.println(allDigitsCount(1015));
    }
}