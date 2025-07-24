package Abstarction;

public class UserRegistration {
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException();
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {
        UserRegistration userReg = new UserRegistration();

        try {
            userReg.registerUser("Mickey", "US"); // Example 1
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        try {
            userReg.registerUser("Mini", "India"); // Example 2
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }
}
