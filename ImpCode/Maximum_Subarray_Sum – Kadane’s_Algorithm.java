public class Solution {

    static int maxSubArraySum(int[] a) {
        int maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int i = 0; i < a.length; i++) {
            maxEndingHere += a[i];

            // Use Math.max to find the maximum 
            // of maxSoFar and maxEndingHere
            maxSoFar = Math.max(maxSoFar, maxEndingHere);

            // Use Math.max to reset maxEndingHere 
            // to 0 if it becomes negative
            maxEndingHere = Math.max(maxEndingHere, 0);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }
}
