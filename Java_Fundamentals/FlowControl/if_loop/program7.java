public class program7 {
    public static void main(String[] args) {

        char ch = args[0].charAt(0);

        if (Character.isLowerCase(ch))
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
        else
            System.out.println(ch + " -> " + Character.toLowerCase(ch));
    }
}