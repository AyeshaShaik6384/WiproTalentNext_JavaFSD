public class program9 {

    public static void main(String[] args) {

        int[] arr = new int[args.length];
        int[] result = new int[arr.length];

        for (int i = 0; i < args.length; i++)
            arr[i] = Integer.parseInt(args[i]);

        int index = 0;

        for (int num : arr) {

            if (num != 10)
                result[index++] = num;
        }

        for (int num : result)
            System.out.print(num + " ");
    }
}