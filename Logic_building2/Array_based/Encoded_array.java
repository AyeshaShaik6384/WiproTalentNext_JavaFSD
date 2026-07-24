class UserMainCode {

    public void findOriginalFirstAndSum(int[] input1, int input2, Result output) {

        int[] original = new int[input2];

        original[input2 - 1] = input1[input2 - 1];

        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = input1[i] - original[i + 1];
        }

        int sum = 0;

        for (int x : original)
            sum += x;

        output.output1 = original[0];
        output.output2 = sum;
    }
}