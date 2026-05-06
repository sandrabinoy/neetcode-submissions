class Solution {
    private List<List<Integer>> output;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        output = new ArrayList<>();
        backtrack(nums, target, 0, 0, new ArrayList<>());
        return output;
    }
    private void backtrack(int[] nums, int target, int total, int idx, List<Integer> res) {
        if (total == target) {
            output.add(new ArrayList<>(res));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            int n = nums[i];
            if (total + n > target) {
                return;
            }
            res.add(n);
            backtrack(nums, target, total + n, i, res);
            res.remove(res.size() - 1);
        }
    }
}
