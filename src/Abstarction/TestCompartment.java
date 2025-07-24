package Abstarction;


abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "Welcome to First Class";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "This is Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "This is General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "This is Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        for (int i = 0; i < compartments.length; i++) {
            int r = (int) (Math.random() * 4) + 1;
            switch (r) {
                case 1: compartments[i] = new FirstClass(); break;
                case 2: compartments[i] = new Ladies();    break;
                case 3: compartments[i] = new General();   break;
                default: compartments[i] = new Luggage();  break;
            }
            System.out.println(compartments[i].notice());
        }
    }
}

