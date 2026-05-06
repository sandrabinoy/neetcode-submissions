class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, currLen = 0;
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                currLen = 0;
            } else {
                set.add(ch);
            }
            currLen++;
            maxLen = Math.max(maxLen, currLen);
        }
        return maxLen;
    }
}
