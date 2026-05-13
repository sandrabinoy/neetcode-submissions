class Solution {
    public int maxArea(int[] heights) {
        int h = heights.length;
        if (heights == null || h == 0) return -1;

        int left = 0, right = h-1;
        int max = 0;

        while (left <= right) {
            int lHeight = heights[left], rHeight = heights[right];
            int area = Math.min(lHeight, rHeight) * (right - left);
            max = Math.max(max, area);
            if (lHeight < rHeight) left++;
            else right--;
        }
        return max;
    }
}
