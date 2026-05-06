class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int num : nums) {
            if (numsMap.containsKey(num)) {
                return true;
            }
            numsMap.put(num, 1);
        }
        return false;
    }
}