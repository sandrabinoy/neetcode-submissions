class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int ithTemp = temperatures[i];
            for (int j = i+1; i < temperatures.length; i++) {
                int jthTemp = temperatures[j];
                if (jthTemp > ithTemp) {
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}
