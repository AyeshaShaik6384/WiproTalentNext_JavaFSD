//package Logic_building.Day-6;

public class NthPrime {
    public static int nthPrime(int n) {

        int count = 0;
        int num = 1;

        while (count < n) {

            num++;

            boolean prime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                count++;
        }

        return num;
    }

    public static void main(String[] args) {

        System.out.println(nthPrime(10));
        System.out.println(nthPrime(13));
    }
}
