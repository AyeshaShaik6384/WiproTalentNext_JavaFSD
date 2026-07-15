//package Logic_building.Day-10;

public class ReadSecondWord {
    public static String readSecondWord(String input1) {

        input1 = input1.trim();

        String[] words = input1.split("\\s+");

        if (words.length < 2)
            return "LESS";

        return words[1].toUpperCase();
    }

    public static void main(String[] args) {

        System.out.println(readSecondWord("Wipro Technologies Bangalore"));
        System.out.println(readSecondWord("Hello World"));
        System.out.println(readSecondWord("Championship 2017 League"));
        System.out.println(readSecondWord("Hello"));
    }
}
