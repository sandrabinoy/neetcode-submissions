class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        if (nums == null || n < 1) return new ArrayList<>();

        Set<Integer> res = new HashSet<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);
            if (count > (n / 3)) res.add(num);
        }
        
        return res.stream().toList();
    }
}