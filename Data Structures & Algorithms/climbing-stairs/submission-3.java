class Solution {
    public int climbStairs(int n) {
        if (n < 1) return 0;
        int curr = 1, prev = 1;
        for (int i = 0; i < n-1; i++) {
            int temp = curr;
            curr += prev;
            prev = temp;
        }
        return curr;
    }
}
