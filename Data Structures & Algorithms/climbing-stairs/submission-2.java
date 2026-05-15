class Solution {
    public int climbStairs(int n) {
        if (n < 1) return 0;
        int dp1 = 1, dp2 = 1;
        for (int i = 0; i < n-1; i++) {
            int temp = dp1;
            dp1 += dp2;
            dp2 = temp;
        }
        return dp1;
    }
}
