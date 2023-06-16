/*12: Write a program that creates and initializes a four element byte array. Calculate and display the average of its values. */

public class Practical_12 {
    public static void main(String[] args) {
        // Create and initialize a byte array
        byte[] byteArray = { 10, 20, 30, 40 };

        // Calculate the sum of array elements
        int sum = 0;
        for (byte num : byteArray) {
            sum += num;
        }

        // Calculate the average
        double average = (double) sum / byteArray.length;

        // Display the average
        System.out.println("Average of the byte array: " + average);
    }
}
