import java.util.Arrays;

public class program5 {
    public static void main(String[] args) {

        int[] arr = {12, 5, 89, 34, 67, 1};

        Arrays.sort(arr);

        System.out.println("Smallest Two Numbers:");
        System.out.println(arr[0] + " " + arr[1]);

        System.out.println("Largest Two Numbers:");
        System.out.println(arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}