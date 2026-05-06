class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        int len = 0;
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num)+1);
            else map.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= k) {
                output.add(entry.getKey());
            }
        }
        return output.stream().mapToInt(i -> i).toArray();
    }
}
