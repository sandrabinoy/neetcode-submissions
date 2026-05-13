class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        if (len1 == 0) return word2;
        if (len2 == 0) return word1;

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < len1 || i < len2; i++) {
            if (i < len1) str.append(word1.charAt(i));
            if (i < len2) str.append(word2.charAt(i));
        }
        return str.toString();
    }
}