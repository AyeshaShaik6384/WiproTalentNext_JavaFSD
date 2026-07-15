//package Logic_building.Day-10;

public class MostFrequentDigit {
    
    public static int mostFrequentDigit(int input1,
                                        int input2,
                                        int input3,
                                        int input4) {

        int[] freq = new int[10];

        int[] nums = {input1, input2, input3, input4};

        for (int n : nums) {

            n = Math.abs(n);

            if (n == 0)
                freq[0]++;

            while (n > 0) {

                freq[n % 10]++;
                n /= 10;
            }
        }

        int maxFreq = 0;
        int ans = 0;

        for (int i = 0; i <= 9; i++) {

            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = i;
            } else if (freq[i] == maxFreq && i > ans) {
                ans = i;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(mostFrequentDigit(123, 234, 345, 673));
        System.out.println(mostFrequentDigit(123, 456, 345, 5043));
    }
}
