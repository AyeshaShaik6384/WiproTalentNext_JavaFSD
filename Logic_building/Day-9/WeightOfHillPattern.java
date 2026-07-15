//package Logic_building.Day-9;

public class WeightOfHillPattern {
     public static int weightOfHillPattern(int input1,
                                          int input2,
                                          int input3) {

        int weight = input2;
        int total = 0;

        for (int level = 1; level <= input1; level++) {

            total += level * weight;
            weight += input3;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println(weightOfHillPattern(5, 10, 2));
        System.out.println(weightOfHillPattern(4, 1, 5));
    }
}
