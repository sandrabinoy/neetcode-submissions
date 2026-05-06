class Solution {
    private int[][] dp;
    private int totalSum;

    public int findTargetSumWays(int[] nums, int target) {
        totalSum = 0;
        for(int num : nums) totalSum += num;
        dp = new int[nums.length][2 * totalSum + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }
        return backtrack(0, 0, nums, target);
    }

    public int backtrack (int i, int t, int[] nums, int target) {
        if (i == nums.length) {
            return t == target ? 1 : 0;
        }

        if (dp[i][t + totalSum] != Integer.MIN_VALUE) {
            return dp[i][t + totalSum];
        }

        dp[i][t + totalSum] = backtrack(i + 1, t + nums[i], nums, target) + 
               backtrack(i + 1, t - nums[i], nums, target);
        return dp[i][t + totalSum];
    }
}
