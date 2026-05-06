class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> output = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int target = 0 - (nums[i] + nums[j]);
                if (map.containsKey(target) && map.get(target) > j) {
                    output.add(new ArrayList<>(List.of(nums[i], nums[j], nums[map.get(target)])));
                }
            }
        }

        return output;
    }
}
