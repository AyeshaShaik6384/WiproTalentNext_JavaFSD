package src.Abstraction.ExceptionHandling.program4;

public class InvalidCountryException extends Exception {

    public InvalidCountryException(String message) {
        super(message);
    }
}