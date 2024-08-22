class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        // Use TreeSet to store elements in sorted order without duplicates.
        TreeSet<Integer> unionSet = new TreeSet<>();
        
        // Add all elements from arr1 to the TreeSet.
        for (int i = 0; i < n; i++) {
            unionSet.add(arr1[i]);
        }
        
        // Add all elements from arr2 to the TreeSet.
        for (int i = 0; i < m; i++) {
            unionSet.add(arr2[i]);
        }
        
        // Convert the TreeSet to an ArrayList and return.
        return new ArrayList<>(unionSet);
    }
}
