class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length(), tLen = t.length();
        if (sLen != tLen) return false;

        int[] chars = new int[26];
        for (int i = 0; i < sLen; i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
        }

        for (int ch : chars) {
            if (ch != 0) return false;
        }

        return true;
    }
}
