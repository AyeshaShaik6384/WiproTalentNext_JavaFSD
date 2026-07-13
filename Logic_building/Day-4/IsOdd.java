//package Logic_building.Day-4;

public class IsOdd {
    public static int isOdd(int n) {

        if (n % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        System.out.println(isOdd(5));
        System.out.println(isOdd(10));
        System.out.println(isOdd(0));
        System.out.println(isOdd(-7));
    }
}
