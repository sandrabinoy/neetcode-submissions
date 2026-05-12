class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] output = new int[nums.length * 2];
        for (int i = 0, j = 0; i < output.length; i++) {
            output[i] = nums[j++];
            if (j >= nums.length) {
                j = 0;
            }
        }
        return output;
    }
}