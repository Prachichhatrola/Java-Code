/*22: Write an application that reads and processes strings from the console(stays at console). Reverse the sequence of characters in each string and then display it. */

import java.util.Scanner;

public class Practical_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string (or 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String reversed = reverseString(input);

            System.out.println("Reversed string: " + reversed);
        }

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
