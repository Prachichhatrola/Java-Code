/*16: Write a program that will accept a string “java123is234fun” will replace all occurrences of digit with single space character in a new string. (use of replaceAll() function and regular expression for digit). Split the new formed string from space character and form the array of strings (use of split function). Display strings from the array in new line each. */

public class Practical_16 {
    public static void main(String[] args) {
        String inputString = "java123is234fun";

        // Replace all occurrences of digits with a single space
        String modifiedString = inputString.replaceAll("\\d", " ");

        // Split the modified string into an array of strings
        String[] stringArray = modifiedString.split(" ");

        // Display each string from the array on a new line
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
