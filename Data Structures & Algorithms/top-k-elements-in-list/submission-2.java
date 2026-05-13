class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        if (n < 1 || n < k) return new int[]{-1};

        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> count.get(a) - count.get(b));

        for (int c : count.keySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(c);
            } else if (count.get(minHeap.peek()) < count.get(c)) {
                minHeap.poll();
                minHeap.offer(c);
            }
        }

        return minHeap.stream().mapToInt(x->x).toArray();
    }
}
