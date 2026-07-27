package String_Based;

public class GetCodeThroughStrings {

    public static int getCodeThroughStrings(String input1) {

        String[] words = input1.trim().split("\\s+");

        int totalLength = 0;

        for (String word : words) {
            totalLength += word.length();
        }

        while (totalLength >= 10) {

            int sum = 0;

            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength /= 10;
            }

            totalLength = sum;
        }

        return totalLength;
    }

    public static void main(String[] args) {

        System.out.println(getCodeThroughStrings("Wipro Technologies"));

        System.out.println(getCodeThroughStrings("The Good The Bad and The Ugly"));

    }
}