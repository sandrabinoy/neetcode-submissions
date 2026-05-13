class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        if (s == null || len == 0) return;

        int left = 0, right = len - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}