//package Logic_building.Day-6;

public class IsPrime {
    public static int isPrime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return 1;
        }

        return 2;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(7));
        System.out.println(isPrime(10));
    }
}
