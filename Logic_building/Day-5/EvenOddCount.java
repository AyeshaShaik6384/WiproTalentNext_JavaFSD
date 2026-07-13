//package Logic_building.Day-5;

public class EvenOddCount {
    public static int count(int a, int b, int c, int d, int e, String type) {

        int count = 0;

        if (type.equalsIgnoreCase("even")) {

            if (a % 2 == 0) count++;
            if (b % 2 == 0) count++;
            if (c % 2 == 0) count++;
            if (d % 2 == 0) count++;
            if (e % 2 == 0) count++;

        } else if (type.equalsIgnoreCase("odd")) {

            if (a % 2 != 0) count++;
            if (b % 2 != 0) count++;
            if (c % 2 != 0) count++;
            if (d % 2 != 0) count++;
            if (e % 2 != 0) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(count(12, 17, 19, 14, 115, "odd"));
        System.out.println(count(12, 17, 19, 14, 115, "even"));
    }
}
