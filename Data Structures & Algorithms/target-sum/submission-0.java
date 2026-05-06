class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(0, 0, nums, target);
    }

    public int backtrack (int i, int t, int[] nums, int target) {
        if (i == nums.length) {
            return t == target ? 1 : 0;
        }

        return backtrack(i + 1, t + nums[i], nums, target) + 
               backtrack(i + 1, t - nums[i], nums, target);
    }
}
