public class program8 {

    public static void main(String[] args) {

        int[] arr = new int[args.length];

        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);

        int sum = 0;
        boolean ignore = false;

        for (int num : arr) {

            if (num == 6)
                ignore = true;

            if (!ignore)
                sum += num;

            if (num == 7)
                ignore = false;
        }

        System.out.println(sum);
    }
}