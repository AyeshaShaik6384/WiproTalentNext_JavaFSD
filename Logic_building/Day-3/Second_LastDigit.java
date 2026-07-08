public class Second_LastDigit {

    public static int secondLastDigit(int n) {

        n = Math.abs(n);

        if (n < 10)
            return -1;

        return (n / 10) % 10;
    }

    public static void main(String[] args) {

        System.out.println(secondLastDigit(197));
        System.out.println(secondLastDigit(-197));
        System.out.println(secondLastDigit(5));
    }
}