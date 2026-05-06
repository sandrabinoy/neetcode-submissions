class Solution {
    public int[] productExceptSelf(int[] nums) {

        if (nums.length <= 1) {
            return nums;
        }
        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            products[i] = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                products[i] *= nums[j];
            }
        }
        return products;
        
    }
}  
