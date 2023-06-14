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
