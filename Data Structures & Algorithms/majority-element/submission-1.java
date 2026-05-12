class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length < 1) return -1;

        Map<Integer, Integer> count = new HashMap<>();
        int res = 0, maxCount = 0;

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
            if (count.get(n) > maxCount) {
                res = n;
                maxCount = count.get(n);
            }
        }
        return res;
    }
}