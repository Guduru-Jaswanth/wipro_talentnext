package Abstarction;
public class PersonInfo {
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Please provide name and age as command-line arguments.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException("Age must be >= 18 and < 60.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Invalid age format. Please enter a valid integer for age.");
        } catch (InvalidAgeException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
