class UserMainCode {

    public int mostFrequentlyOccurringDigit(int[] input1, int input2) {

        int[] freq = new int[10];

        for (int i = 0; i < input2; i++) {

            int n = Math.abs(input1[i]);

            if (n == 0) {
                freq[0]++;
                continue;
            }

            while (n > 0) {
                freq[n % 10]++;
                n /= 10;
            }
        }

        int max = -1;
        int ans = 0;

        for (int i = 0; i < 10; i++) {

            if (freq[i] > max) {
                max = freq[i];
                ans = i;
            } else if (freq[i] == max && i > ans) {
                ans = i;
            }
        }

        return ans;
    }
}