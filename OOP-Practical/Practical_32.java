/*32: Write a program that will accept two integers with the use of command line or scanner class. Divide first integer by second, display the result and also handle appropriate exception if second number is zero. */

import java.util.Scanner;

public class Practical_32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        try {
            int result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();
    }

    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }
}
