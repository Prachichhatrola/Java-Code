import java.util.Locale;

public class StringChallenge {
    public static String isPalindrome(String stx) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanStr = stx.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ROOT);
        
        // Check if the string is the same forward and backward
        String reversedStr = new StringBuilder(cleanStr).reverse().toString();
        if (cleanStr.equals(reversedStr)) {
            return "true";
        } else {
            return "false";
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("Noel sees Leon"));  // Output: true
        System.out.println(isPalindrome("A war at Tarawa!"));  // Output: true
        System.out.println(isPalindrome("Hello, World!"));  // Output: false
    }
}
