class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (prices == null || len == 0) return 0;
        int max = 0;
        int buy = prices[0];
        
        for (int price : prices) {
            max = Math.max(max, price - buy);
            buy = Math.min(buy, price);
        }
        return max;
    }
}
