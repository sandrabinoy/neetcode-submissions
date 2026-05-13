class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (prices == null || len == 0) return 0;
        int max = 0;
        int buy = prices[0];
        
        for (int i = 1; i < len; i++) {
            int currProfit = prices[i] - buy;
            if (currProfit < 0) {
                buy = prices[i];
            }
            max = Math.max(max, currProfit);
        }
        return max;
    }
}
