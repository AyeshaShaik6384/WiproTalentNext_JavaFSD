package Collections.Method_Reference.Program1;

public class FactorialClass {
    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }
}
