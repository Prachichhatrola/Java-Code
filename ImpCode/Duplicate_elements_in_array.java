import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 8};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.print("Duplicate elements in the array: ");
        for (int num : duplicates) {
            System.out.print(num + " ");
        }
    }
}
