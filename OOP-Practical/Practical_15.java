public class Practical_15 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        // Compare the strings
        boolean areEqual = str1.equals(str2);

        System.out.println("Are the strings equal? " + areEqual);

        // Append the second string to the first
        str1 = str1 + str2;

        System.out.println("Combined string: " + str1);
    }
}
