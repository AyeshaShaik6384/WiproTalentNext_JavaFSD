//package Logic_building.Day-4;

public class SecondLastDigit {
    public static int getSecondLastDigit(int n) {

        n = Math.abs(n);

        if (n < 10)
            return -1;

        return (n / 10) % 10;
    }

    public static void main(String[] args) {

        System.out.println(getSecondLastDigit(197));
        System.out.println(getSecondLastDigit(-197));
        System.out.println(getSecondLastDigit(5));
    }
}
