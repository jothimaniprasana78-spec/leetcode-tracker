// Last updated: 7/9/2026, 10:51:14 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maxSum = Math.max(maxSum, current);
        }

        return maxSum;
    }
}