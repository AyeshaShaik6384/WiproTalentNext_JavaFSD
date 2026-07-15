//package Logic_building.Day-9;

public class CreatePIN {
    public static int createPIN(int input1, int input2, int input3) {

        int u1 = input1 % 10;
        int u2 = input2 % 10;
        int u3 = input3 % 10;

        int t1 = (input1 / 10) % 10;
        int t2 = (input2 / 10) % 10;
        int t3 = (input3 / 10) % 10;

        int h1 = input1 / 100;
        int h2 = input2 / 100;
        int h3 = input3 / 100;

        int unit = Math.min(u1, Math.min(u2, u3));
        int ten = Math.min(t1, Math.min(t2, t3));
        int hundred = Math.min(h1, Math.min(h2, h3));

        int maxDigit = 0;

        int[] nums = {input1, input2, input3};

        for (int n : nums) {

            while (n > 0) {

                int d = n % 10;

                if (d > maxDigit)
                    maxDigit = d;

                n /= 10;
            }
        }

        return maxDigit * 1000 + hundred * 100 + ten * 10 + unit;
    }

    public static void main(String[] args) {

        System.out.println(createPIN(123, 582, 175));
        System.out.println(createPIN(190, 267, 853));
    }
}
