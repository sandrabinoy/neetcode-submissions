class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length == 0) return false;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) return true;
            numSet.add(num);
        }
        return false;
    }
}