class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int sum = nums[0];
        int currSum = 0;
        for (int num : nums) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += num;
            sum = Math.max(currSum, sum);
        }
        return sum;
    }
}
