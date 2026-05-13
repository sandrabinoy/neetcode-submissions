class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (nums == null || n == 0) return -1;
        int i = 0, j = 1;

        while (j < n) {
            while (j < n && nums[i] == nums[j]) j++;
            if (i < n && j < n) nums[++i] = nums[j++];
        }
        return i+1;
    }
}