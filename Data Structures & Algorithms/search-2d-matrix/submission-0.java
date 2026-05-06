class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int l = 0, r = n - 1;
        int row = 0;
        while (l <= r && row >= 0 && row < n) {
            int mid = l + (r - l) / 2;
            int val = matrix[row][mid];
            if (val == target) return true;
            else if (val < target && target > matrix[row][n - 1] && row < n - 1) {
                row++;
                l = 0;
                r = n - 1;
            } else if (val > target && target < matrix[row][0] && row > 0) {
                row--;
                l = 0;
                r = n - 1;
            } else if (val < target) l = mid + 1;
            else r = mid - 1;
        }
        return false;
    }
}
