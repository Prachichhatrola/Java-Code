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
