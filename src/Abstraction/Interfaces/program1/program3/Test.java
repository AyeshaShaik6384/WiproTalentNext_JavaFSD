package src.Abstraction.Interfaces.program1.program3;

@FunctionalInterface
interface MyTest {

    int myFunction(int a, int b, int c);

}

public class Test {

    public static void main(String[] args) {

        // Lambda for Addition
        MyTest t1 = (a, b, c) -> a + b + c;

        // Lambda for Multiplication
        MyTest t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(10, 20, 30));

        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));
    }
}
