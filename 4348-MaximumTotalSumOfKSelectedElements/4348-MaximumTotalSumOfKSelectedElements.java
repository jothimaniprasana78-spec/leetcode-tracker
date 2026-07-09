// Last updated: 7/9/2026, 10:50:53 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);

        long ans =0;
        int currentMul = mul;

        for(int i = nums.length - 1; i >= nums.length - k; i--){
            long add = nums[i];
            long multiply = 1L * nums[i] * currentMul;

            ans += Math.max(add, multiply);
            currentMul--;
        }
        return ans;
    }
}