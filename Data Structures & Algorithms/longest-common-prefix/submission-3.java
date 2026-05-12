class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) return "";
        
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char curr = '#';
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return str.toString();
                }
                if (curr != '#' && curr != strs[j].charAt(i)) return str.toString();
                curr = strs[j].charAt(i);
            }
            str.append(curr);
        }
        return str.toString();
    }
}