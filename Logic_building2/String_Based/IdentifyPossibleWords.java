package String_Based;

public class IdentifyPossibleWords {

    public static String identifyPossibleWords(String input1, String input2) {

        String[] words = input2.split(":");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (word.length() != input1.length())
                continue;

            boolean match = true;

            for (int i = 0; i < input1.length(); i++) {

                char c1 = Character.toLowerCase(input1.charAt(i));
                char c2 = Character.toLowerCase(word.charAt(i));

                if (c1 != '_' && c1 != c2) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (result.length() > 0)
                    result.append(":");

                result.append(word.toUpperCase());
            }
        }

        if (result.length() == 0)
            return "ERROR-009";

        return result.toString();
    }

    public static void main(String[] args) {

        String input1 = "Fi_er";

        String input2 = "Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";

        System.out.println(identifyPossibleWords(input1, input2));
    }
}