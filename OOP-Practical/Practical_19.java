public class Practical_19 {
    public static void main(String[] args) {
        int totalCharacterCount = 0;
        
        // Iterate through all command-line arguments
        for (String arg : args) {
            totalCharacterCount += arg.length();
        }
        
        // Display the total character count
        System.out.println("Total character count: " + totalCharacterCount);
    }
}