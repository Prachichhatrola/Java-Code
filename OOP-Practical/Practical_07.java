/*7: Write an application that converts between meters and feet. its first command-line argument is a number. Its second command-line argument if either “feet” or “meters”. If this argument equal “feet”, display a string reporting the equivalent number of meters. If this argument equal “meters”, display a string reporting the equivalent number of feet. Otherwise, report that the unit system is not recognized. (note: one meter is equal to 3.28 feet.) */

import java.util.Scanner;

public class Practical_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double value = scanner.nextDouble();

        System.out.print("Enter the unit system (feet/meters): ");
        String unit = scanner.next();

        if (unit.equalsIgnoreCase("feet")) {
            double meters = value / 3.28;
            System.out.println(value + " feet is equal to " + meters + " meters.");
        } 
        else if (unit.equalsIgnoreCase("meters")) {
            double feet = value * 3.28;
            System.out.println(value + " meters is equal to " + feet + " feet.");
        } 
        else {
            System.out.println("Unit system not recognized. Please specify either feet or meters.");
        }

        scanner.close();
    }
}
