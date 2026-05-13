class Solution {
    public int maxArea(int[] heights) {
        int h = heights.length;
        if (heights == null || h == 0) return -1;

        int l = 0, r = h-1;
        int max = 0;

        while (l <= r) {
            int area = Math.min(heights[l], heights[r]) * (r - l);
            max = Math.max(max, area);
            if (heights[l] < heights[r]) l++;
            else r--;
        }
        return max;
    }
}
