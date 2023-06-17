/*17: Write a program that displays the substring formed by the last ten characters of a string given as command line argument.(Use length() method) */

public class Practical_17 {
    public static void main(String[] args) {
        String inputString = "Hello, World";

        // Get the length of the input string
        int length = inputString.length();

        // Check if the length is less than or equal to 10
        if (length <= 10) {
            System.out.println("Substring: " + inputString);
        } else {
            // Get the substring of the last ten characters
            String substring = inputString.substring(length - 10);

            System.out.println("Substring: " + substring);
        }
    }
}
