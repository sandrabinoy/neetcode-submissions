class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == 0) return 0;

        int res = 0, maxf = 0;
        int left = 0;

        Map<Character, Integer> count = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            count.put(curr, count.getOrDefault(curr, 0) + 1);
            maxf = Math.max(maxf, count.get(curr));

            while ((right - left + 1) - maxf > k) {
                count.put(s.charAt(left), count.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
