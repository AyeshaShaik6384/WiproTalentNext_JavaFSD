package Collections.Method_Reference.Program3;

public class TestPrime {
     public static void main(String[] args) {

        PrimeInterface pi = PrimeCheck::new;

        pi.create(17);
        pi.create(20);
    }
}
