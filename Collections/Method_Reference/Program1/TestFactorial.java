package Collections.Method_Reference.Program1;

public class TestFactorial {
    public static void main(String[] args) {

        FactorialClass obj = new FactorialClass();

        FactorialInterface fi = obj::factorial;

        System.out.println(fi.factorial(5));
    }
}
