class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length < 1) return new int[]{-200};

        int prefix = 1, postfix = 1;
        int[] output = new int[nums.length];
        Arrays.fill(output, 1);

        for (int i = 0; i < nums.length; i++) {
            output[i] *= prefix;
            prefix *= nums[i];
        }

        for (int j = nums.length - 1; j >= 0; j--) {
            output[j] *= postfix;
            postfix *= nums[j];
        }
        
        return output;
    }
}  
