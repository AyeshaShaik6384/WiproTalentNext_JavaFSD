package Collections.MiniProject;

import java.util.ArrayList;

public class StringOperations {

    public static ArrayList<String> performOperations(String S1, String S2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        int j = 0;

        for (int i = 0; i < S1.length(); i++) {

            if (i % 2 == 0 && j < S2.length()) {
                op1.append(S2.charAt(j));
                j++;
            } else {
                op1.append(S1.charAt(i));
            }

            if (j == S2.length())
                j = 0;
        }

        list.add(op1.toString());

        // Operation 2
        int first = S1.indexOf(S2);
        int last = S1.lastIndexOf(S2);

        if (first != -1 && first != last) {

            String rev = new StringBuilder(S2).reverse().toString();

            String op2 = S1.substring(0, last)
                    + rev
                    + S1.substring(last + S2.length());

            list.add(op2);

        } else {

            list.add(S1 + S2);
        }

        // Operation 3
        if (first != -1 && first != last) {

            String op3 = S1.substring(0, first)
                    + S1.substring(first + S2.length());

            list.add(op3);

        } else {

            list.add(S1);
        }

        // Operation 4
        int mid;

        if (S2.length() % 2 == 0)
            mid = S2.length() / 2;
        else
            mid = S2.length() / 2 + 1;

        String firstHalf = S2.substring(0, mid);
        String secondHalf = S2.substring(mid);

        list.add(firstHalf + S1 + secondHalf);

        // Operation 5
        StringBuilder op5 = new StringBuilder();

        for (int i = 0; i < S1.length(); i++) {

            char ch = S1.charAt(i);

            if (S2.indexOf(ch) != -1)
                op5.append('*');
            else
                op5.append(ch);
        }

        list.add(op5.toString());

        return list;
    }

    public static void main(String[] args) {

        String S1 = "JAVAJAVA";
        String S2 = "VA";

        ArrayList<String> result = performOperations(S1, S2);

        for (String s : result) {
            System.out.println(s);
        }
    }
}

