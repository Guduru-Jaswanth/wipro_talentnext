package Test;

import com.wipro.automobile.ship.Compartment;

public class TestCompartment {
    public static void main(String[] args) {
        Compartment c = new Compartment(10.5, 8.2, 6.0);
        c.displayDimensions();
        System.out.println("Volume: " + c.getVolume());
    }
}
