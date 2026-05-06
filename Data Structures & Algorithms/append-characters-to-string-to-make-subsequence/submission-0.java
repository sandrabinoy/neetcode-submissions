class Solution {
    public int appendCharacters(String s, String t) {
        int pointerT = 0;
        int lenT = t.length();
        int lenS = s.length();
        for (char ch : s.toCharArray()) {
            if (ch == t.charAt(pointerT)) {
                pointerT++;
            }
            if (pointerT == lenT) {
                break;
            }
        }
        return lenT - pointerT;
    }
}