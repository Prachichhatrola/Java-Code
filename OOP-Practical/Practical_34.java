// 34: Demonstrate NumberFormatException in the program when wrong data for some variable is entered.

import java.util.Scanner;

public class Practical_34 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            
            // Parsing the number, which can throw NumberFormatException
            int number = Integer.parseInt(input);
            
            System.out.println("Entered number: " + number);
            
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format! Please enter a valid integer.");
        }
    }
}

