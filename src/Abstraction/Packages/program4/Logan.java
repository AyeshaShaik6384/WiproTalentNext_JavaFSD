package src.Abstraction.Packages.program4;

//import com.automobile.Vehicle;
import src.Abstraction.Packages.program3.Vehicle;
public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39AB1111";
    }

    @Override
    public String getOwnerName() {
        return "Ayesha";
    }

    public int speed() {
        return 140;
    }

    public int gps() {
        return 1;
    }
}