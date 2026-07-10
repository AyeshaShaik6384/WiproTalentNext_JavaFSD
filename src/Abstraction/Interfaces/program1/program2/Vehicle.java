package src.Abstraction.Interfaces.program1.program2;

public interface Vehicle {

    default void message() {
        System.out.println("Inside Vehicle");
    }
}