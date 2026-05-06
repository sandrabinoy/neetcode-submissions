class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Map<Integer, Integer> numsMap = new HashMap<>();
        for(int num : nums) {
            if (numsMap.contains(num)) {
                return true;
            }
            map.put(num);
        }
        return false;
    }
}