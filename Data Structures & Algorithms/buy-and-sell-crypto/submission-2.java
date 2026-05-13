class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (prices == null || len == 0) return 0;
        int max = 0;
        int buy = prices[0];
        
        for (int price : prices) {
            buy = Math.min(buy, price);
            max = Math.max(max, price - buy);
        }
        return max;
    }
}
