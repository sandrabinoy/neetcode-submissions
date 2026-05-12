class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length < 1) return 0;

        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) continue;
            int temp = nums[i];
            nums[p] = nums[i];
            nums[i] = temp;
            p++;
        }
        return p;
    }
}