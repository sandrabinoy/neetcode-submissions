class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums) {
            if (numsSet.contains(num)) {
                return true;
            }
            numsSet.add(num);
        }
        return false;
    }
}