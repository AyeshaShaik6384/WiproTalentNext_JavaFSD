import java.util.Scanner;

public class RepeatingCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String first = str.substring(0, 2);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++)
            ans.append(first);

        System.out.println(ans);

        sc.close();
    }
}