//package Logic_building.Day7;

public class PrimeNumbersCount {
    static boolean isPrime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static int countPrimes(int start, int end) {

        int count = 0;

        for (int i = start; i <= end; i++) {

            if (isPrime(i))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(countPrimes(2, 20));
        System.out.println(countPrimes(700, 725));
    }
}
