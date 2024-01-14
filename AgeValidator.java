class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        try {
            // Check if there is exactly one command line argument
            if (args.length != 1) {
                System.out.println("Please provide your age as a command line argument.");
                return;
            }

            // Parse the command line argument as an integer
            int age = Integer.parseInt(args[0]);

            // Validate age and raise exception if it's less than 18
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older.");
            }

            // If age is valid, print a success message
            System.out.println("Age is valid. You are eligible.");

        } catch (NumberFormatException e) {
            // Handle the case where the command line argument is not a valid integer
            System.out.println("Please provide a valid integer for age.");
        } catch (InvalidAgeException e) {
            // Handle the custom exception for invalid age
            System.out.println("Invalid Age: " + e.getMessage());
        }
    }
}
