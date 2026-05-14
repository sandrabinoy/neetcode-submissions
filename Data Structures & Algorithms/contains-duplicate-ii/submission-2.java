class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (nums == null || n == 0) return false;

        boolean hasDupe = false;

        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int ni = nums[i];
            int j = numsMap.getOrDefault(ni, i);
            if (j != i) {
                if (i - j > k) hasDupe = false;
                else hasDupe = true;
            }
            numsMap.put(ni, i);
        }
        return hasDupe;
    }
}