/*13: Write a program to search in the int array with use of for each style for loop. */

public class Practical_13 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        int searchElement = 30;

        boolean found = false;

        // Search for the element using for-each style loop
        for (int number : numbers) {
            if (number == searchElement) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("Element " + searchElement + " found in the array.");
        } 
        else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}
