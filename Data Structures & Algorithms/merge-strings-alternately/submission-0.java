class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        if (len1 == 0) return word2;
        if (len2 == 0) return word1;

        StringBuilder str = new StringBuilder();

        int i = 0, j = 0;

        while (i < len1 || j < len2) {
            if (i < len1) str.append(word1.charAt(i++));
            if (j < len2) str.append(word2.charAt(j++));
        }
        return str.toString();
    }
}