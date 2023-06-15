public class Practical_20 {
    public static void main(String[] args) {
        boolean foundInvalidArgument = false;
        
        // Iterate through all command-line arguments
        for (String arg : args) {
            // Check if the argument starts with an uppercase letter
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument '" + arg + "' does not begin with an uppercase letter");
                foundInvalidArgument = true;
            }
        }
        
        // Display success message if all arguments are valid
        if (!foundInvalidArgument) {
            System.out.println("All arguments are valid.");
        }
    }
}
