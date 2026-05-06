class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int sum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int currSum = nums[i];
            for (int j = nums.length - 1; j > i; j--) {
                currSum += nums[j];
            }
            sum = Math.max(currSum, sum);
        }
        return sum;
    }
}
