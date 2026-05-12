class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length < 1) return -1;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int n : nums) {
            numsMap.put(n, numsMap.getOrDefault(n, 0) + 1);
        }
        int maxCount = 0, maxEl = 0;
        for (Map.Entry<Integer,Integer> el : numsMap.entrySet()) {
            if (el.getValue() > maxCount) {
                maxCount = el.getValue();
                maxEl = el.getKey();
            }
        }
        return maxEl;
    }
}