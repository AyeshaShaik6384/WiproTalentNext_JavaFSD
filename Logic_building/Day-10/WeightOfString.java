//package Logic_building.Day-10;

public class WeightOfString {
    public static int weightOfString(String input1, int input2) {

        int sum = 0;

        input1 = input1.toLowerCase();

        for (int i = 0; i < input1.length(); i++) {

            char ch = input1.charAt(i);

            if (Character.isLetter(ch)) {

                if (input2 == 0 && "aeiou".indexOf(ch) != -1)
                    continue;

                sum += (ch - 'a' + 1);
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(weightOfString("Hello World!!", 0));
        System.out.println(weightOfString("Hello World!!", 1));
    }
}
