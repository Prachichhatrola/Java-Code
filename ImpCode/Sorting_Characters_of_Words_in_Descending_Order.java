import java.util.Arrays;

public class SortCharactersDescending {
    public static void main(String[] args) {
        String[] arr = {"apple", "bol", "toy"};

        // Sort characters of each word in descending order
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray(); // Convert word to character array
            Arrays.sort(chars); // Sort characters in ascending order
            arr[i] = new StringBuilder(new String(chars)).reverse().toString(); // Reverse to get descending order
        }

        // Print the result
        System.out.println(Arrays.toString(arr));
    }
}
