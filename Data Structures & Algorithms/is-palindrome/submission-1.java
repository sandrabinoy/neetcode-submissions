class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        if (len == 0) return false;

        String alphanumeric = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = alphanumeric.length() - 1;

        while (left < right) {
            if (alphanumeric.charAt(left) != alphanumeric.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
