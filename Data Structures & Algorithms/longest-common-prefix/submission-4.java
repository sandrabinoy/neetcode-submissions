class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return str.toString();
                }
            }
            str.append(strs[0].charAt(i));
        }
        return str.toString();
    }
}