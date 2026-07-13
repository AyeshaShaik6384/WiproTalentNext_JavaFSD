//package Logic_building.Day-4;

public class LastDigit {
    public static int getLastDigit(int n) {

        if (n < 0)
            n = -n;

        return n % 10;
    }

    public static void main(String[] args) {

        System.out.println(getLastDigit(197));
        System.out.println(getLastDigit(-197));
        System.out.println(getLastDigit(105));
    }
}
