import java.util.Scanner;

public class Alternate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        StringBuilder ans = new StringBuilder();

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            ans.append(a.charAt(i));
            ans.append(b.charAt(i));
        }

        if (a.length() > b.length())
            ans.append(a.substring(min));

        else if (b.length() > a.length())
            ans.append(b.substring(min));

        System.out.println(ans);

        sc.close();
    }
}