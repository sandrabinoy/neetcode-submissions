class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) return 0;

        int res = 0;
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        for (int n : nums) {
            int streak = 0, curr = n;
            while(set.contains(curr)) {
                streak++;
                curr++;
            }
            res = Math.max(res, streak);    
        }

        return res;
    }
}
