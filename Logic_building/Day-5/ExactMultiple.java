//package Logic_building.Day-5;

public class ExactMultiple {
    public static int isExactMultiple(int n, int m) {

        if (n == 0 || m == 0)
            return 3;

        if (n % m == 0)
            return 2;

        return 1;
    }

    public static void main(String[] args) {

        System.out.println(isExactMultiple(20, 5));
        System.out.println(isExactMultiple(20, 6));
        System.out.println(isExactMultiple(0, 5));
        System.out.println(isExactMultiple(10, 0));
    }
}
