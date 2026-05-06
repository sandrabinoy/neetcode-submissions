class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> output = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int target = 0 - (nums[i] + nums[j]);
                if (map.containsKey(target) && map.get(target) > j) {
                    output.add(new ArrayList<>(List.of(nums[i], nums[j], nums[map.get(target)])));
                }
            }
        }

        return output;
    }
}
