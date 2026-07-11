import java.util.Scanner;

public class Repeat_last {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        String last = str.substring(str.length() - n);

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++)
            ans.append(last);

        System.out.println(ans);

        sc.close();
    }
}