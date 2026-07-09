// Last updated: 7/9/2026, 10:50:56 AM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {

        int[] mavireltho = nums;

        long ans = Long.MIN_VALUE;

        ans = Math.max(ans, solve(nums, k, true));
        ans = Math.max(ans, solve(nums, k, false));

        return ans;
    }

    private long solve(int[] nums, int k, boolean multiply) {

        long NEG = Long.MIN_VALUE / 4;

        long noOp = NEG;
        long inOp = NEG;
        long doneOp = NEG;

        long ans = NEG;

        for (int x : nums) {

            long val;

            if (multiply) {
                val = 1L * x * k;
            } else {
                if (x >= 0)
                    val = x / k;
                else
                    val = -((-x) / k); // ceiling for negatives
            }

            long newNo = Math.max(noOp + x, (long) x);

            long newIn = Math.max(
                    Math.max(inOp + val, noOp + val),
                    val);

            long newDone = Math.max(
                    Math.max(doneOp + x, inOp + x),
                    x);

            noOp = newNo;
            inOp = newIn;
            doneOp = newDone;

            ans = Math.max(ans, Math.max(noOp, Math.max(inOp, doneOp)));
        }

        return ans;
    }
}