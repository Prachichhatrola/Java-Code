class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (a < count) {
                    a = count;
                }

                count = 0;
            }
        }
        if (a > count)
            return a;
        else
            return count;
    }
}
