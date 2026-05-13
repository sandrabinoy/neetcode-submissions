class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 1) return 0;

        int res = 0;
        Set<Integer> set = new HashSet<>();

        for (int n : nums) {
            set.add(n);
        }

        for (int n : nums) {
            if (!set.contains(n - 1)) {
                int len = 1;
                while(set.contains(n + len)) {
                    len++;
                }
                res = Math.max(res, len);
            }
        }

        return res;
    }
}
