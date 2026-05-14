class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int maxLen = 0;
        int[] lastSeen = new int[128];
        for (int i = 0, j = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            j = Math.max(lastSeen[ch], j);
            maxLen = Math.max(maxLen, i - j + 1);
            lastSeen[ch] = i + 1;
        }
        return maxLen;
    }
}
