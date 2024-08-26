class Solution {
    // Function for finding the length of the longest sub-array with sum equal to K
    public static int lenOfLongSubarr(int A[], int N, int K) {
        // HashMap to store the cumulative sum and its earliest index
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int currSum = 0;

        for (int i = 0; i < N; i++) {
            // Add the current element to the cumulative sum
            currSum += A[i];

            // Check if current cumulative sum is equal to the required sum K
            if (currSum == K) {
                maxLen = i + 1; // Update maxLen as sub-array starts from index 0
            }

            // If (currSum - K) exists in map, update maxLen
            if (map.containsKey(currSum - K)) {
                maxLen = Math.max(maxLen, i - map.get(currSum - K));
            }

            // If current cumulative sum is not present in map, add it
            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
        }

        return maxLen;
    }
}
