//package Logic_building.Day-4;

public class SumOfLastDigits {
    public static int addLastDigits(int input1, int input2) {

        if (input1 < 0)
            input1 = -input1;

        if (input2 < 0)
            input2 = -input2;

        return (input1 % 10) + (input2 % 10);
    }

    public static void main(String[] args) {

        System.out.println(addLastDigits(267,154));
        System.out.println(addLastDigits(-267,154));
        System.out.println(addLastDigits(267,-154));
        System.out.println(addLastDigits(-267,-154));
    }
}
