public class IsEven {

    public static int isEven(int n) {

        if (n % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {

        System.out.println(isEven(10));
        System.out.println(isEven(5));
    }
}