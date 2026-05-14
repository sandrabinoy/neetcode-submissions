class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills == null || bills.length == 0) return false;

        int five = 0, ten = 0;

        for (int b : bills) {
            if (b == 5) {
                five++;
            } else if (b == 10) {
                ten++;
                five--;
            } else if (b == 20) {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                }
                else {
                    five -= 3;
                }
            }
            if (five < 0 || ten < 0) return false;
        }
        return true;
    }
}