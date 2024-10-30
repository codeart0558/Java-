import java.util.Scanner;

class CustomAgeException extends Exception {
    public CustomAgeException(String message) {
        super(message);
    }
}

public class Finally_block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = -1;

        try {
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            validateAge(age);
        } catch (CustomAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Exiting the program.");
            // Close the scanner resource
            sc.close();
        }
    }

    public static void validateAge(int age) throws CustomAgeException {
        if (age < 0) {
            throw new CustomAgeException("Age cannot be negative.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
}
