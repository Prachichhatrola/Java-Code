import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }
}

public class Practical_33 {
    public static void main(String[] args) {
        try {
            int age;
            if (args.length > 0) {
                age = Integer.parseInt(args[0]);
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your age: ");
                age = scanner.nextInt();
                scanner.close();
            }

            if (age < 0 || age > 120) {
                throw new InvalidAgeException("Invalid age! Age should be between 0 and 120.");
            }

            System.out.println("Valid age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format! Please enter a valid integer age.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
