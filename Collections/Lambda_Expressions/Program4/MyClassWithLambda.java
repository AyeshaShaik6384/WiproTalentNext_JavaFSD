package Collections.Lambda_Expressions.Program4;

public class MyClassWithLambda {
     public static void main(String[] args) {

        WordCount wc = str -> {

            if (str.trim().isEmpty())
                return 0;

            return str.trim().split("\\s+").length;
        };

        String sentence = "Welcome to Java Lambda Expressions";

        System.out.println("Sentence : " + sentence);
        System.out.println("Word Count : " + wc.count(sentence));
    }
}
