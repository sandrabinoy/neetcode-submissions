class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // Pre-compute the alphabet mapping
        int[] mapping = new int[26];
        for (int i = 0; i < 26; i++) {
            mapping[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (isInvalid(words[i], words[i + 1], mapping)) {
                return false;
            }
        }
        return true;
    }

    private boolean isInvalid(String s1, String s2, int[] mapping) {
        int n = s1.length(), m = s2.length();
        for (int j = 0; j < Math.min(n, m); j++) {
            char c1 = s1.charAt(j);
            char c2 = s2.charAt(j);
            if (c1 != c2) {
                // If s1's char comes after s2's char in alien order, it's invalid
                return mapping[c1 - 'a'] > mapping[c2 - 'a'];
            }
        }
        // If s1 is a prefix of s2, it's valid ("apple", "apples")
        // If s2 is a prefix of s1, it's invalid ("apple", "app")
        return n > m;
    }
}