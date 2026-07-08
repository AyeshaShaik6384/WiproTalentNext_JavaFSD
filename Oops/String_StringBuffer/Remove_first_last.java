import java.util.Scanner;

public class Remove_first_last {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(str.substring(1, str.length() - 1));

        sc.close();
    }
}