class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            numsMap.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int difference = target - numbers[i];
            if (numsMap.containsKey(difference)) {
                if (i < numsMap.get(difference)) {
                    return new int[]{i+1, numsMap.get(difference)+1};
                } else {
                    return new int[]{numsMap.get(difference)+1, i+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
