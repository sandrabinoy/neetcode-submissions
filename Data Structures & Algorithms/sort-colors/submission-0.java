class Solution {
    public void sortColors(int[] nums) {
        if (nums.length < 1) return;
        int k = 0;
        int[] count = new int[3];
        for (int n : nums) {
            count[n]++;
        }

        int idx = 0;
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < count[i]; j++) {
                nums[idx++] = i;
            }
        }
    }
}