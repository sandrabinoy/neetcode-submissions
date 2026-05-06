class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1){
            return true;
        }
        int i = nums[0];
        while (i < nums.length - 1) {
            if (nums[i] == 0) {
                return false;
            }
            i += nums[i];
        }
        return (i == nums.length - 1);
    }
}
