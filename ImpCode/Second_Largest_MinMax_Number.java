public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Initialize the first largest and smallest to be very small and very large values
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        // Traverse the array to find the largest, second largest, smallest, and second smallest elements
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }
            
            if (a[i] < min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2) {
                min2 = a[i];
            }
        }
        
        // Return the second largest and second smallest as an array
        return new int[]{max2, min2};
    }
}
