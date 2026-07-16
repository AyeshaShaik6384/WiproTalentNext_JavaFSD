package Collections.Method_Reference.Program2;

public class estDigitCount {
    public static void main(String[] args) {

        DigitCountInterface dc = DigitCount::digitCount;

        System.out.println(dc.count(123456));
    }
}
