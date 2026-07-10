import test.foundation;

public class TestFoundation {

    public static void main(String[] args) {

        foundation obj = new foundation();

        // System.out.println(obj.var1); // Private - Not Accessible

        // System.out.println(obj.var2); // Default - Not Accessible

        // System.out.println(obj.var3); // Protected - Not Accessible

        System.out.println("var4 = " + obj.var4); // Public - Accessible
    }
}