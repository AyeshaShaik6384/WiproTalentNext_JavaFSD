public class SumOfLastDigit {

    public static int addLastDigits(int input1, int input2) {

        input1 = Math.abs(input1);
        input2 = Math.abs(input2);

        return (input1 % 10) + (input2 % 10);
    }

    public static void main(String[] args) {

        System.out.println(addLastDigits(267,154));
        System.out.println(addLastDigits(-267,154));
        System.out.println(addLastDigits(267,-154));
        System.out.println(addLastDigits(-267,-154));
    }
}