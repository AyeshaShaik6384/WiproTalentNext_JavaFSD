class UserMainCode {
    public void decreasingSequence(int[] input1, int input2, Result output) {
        int count = 0;
        int longest = 0;
        int len = 1;
        for (int i = 1; i < input2; i++) {
            if (input1[i] < input1[i - 1]) {
                len++;
            } else {
                if (len > 1) {
                    count++;
                    if (len > longest)
                        longest = len;
                }
                len = 1;
            }
        }
        if (len > 1) {
            count++;
            if (len > longest)
                longest = len;
        }
        output.output1 = count;
        output.output2 = longest;
    }
}