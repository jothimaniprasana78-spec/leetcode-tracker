// Last updated: 7/9/2026, 10:51:11 AM
class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > reachable)
                return false;

            reachable = Math.max(reachable, i + nums[i]);
        }

        return true;
    }
}