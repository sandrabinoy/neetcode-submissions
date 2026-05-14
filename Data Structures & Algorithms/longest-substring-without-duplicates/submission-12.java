class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();
        int maxLen = 1, currLen = 0;
        int l = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (set.contains(ch)) {
                set.remove(s.charAt(l++));
            }
            set.add(ch);
            maxLen = Math.max(maxLen, i - l + 1);
        }
        return maxLen;
    }
}
