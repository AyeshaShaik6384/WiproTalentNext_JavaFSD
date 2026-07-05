public class program11 {

    public static void main(String[] args) {

        for (String s : args) {
            int num = Integer.parseInt(s);

            if (num != 1 && num != 4) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}