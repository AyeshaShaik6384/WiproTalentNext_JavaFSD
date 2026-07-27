package String_Based;

public class FindStringCode {

    public static int findStringCode(String input1) {

        input1 = input1.toUpperCase();
        String[] words = input1.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            int sum = 0;
            int i = 0;
            int j = word.length() - 1;

            while (i <= j) {

                if (i == j) {
                    sum += word.charAt(i) - 'A' + 1;
                } else {
                    int first = word.charAt(i) - 'A' + 1;
                    int last = word.charAt(j) - 'A' + 1;

                    sum += Math.abs(first - last);
                }

                i++;
                j--;
            }

            result.append(sum);
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {

        System.out.println(findStringCode("World Wide Web"));
        System.out.println(findStringCode("Hello World"));

    }
}
