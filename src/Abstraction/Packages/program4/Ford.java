package src.Abstraction.Packages.program4;

//import com.automobile.Vehicle;
import src.Abstraction.Packages.program3.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39CD2222";
    }

    @Override
    public String getOwnerName() {
        return "Rahul";
    }

    public int speed() {
        return 160;
    }

    public int tempControl() {
        return 22;
    }
}