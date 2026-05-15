class Solution {
    public int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return -1; 
        int m = grid.length, n = grid[0].length;
        int res = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == 1) {
                    res += 4;
                    if (r > 0 && grid[r-1][c] == 1) {
                        res -= 2;
                    }
                    if (c > 0 && grid[r][c-1] == 1) {
                        res -= 2;
                    }
                }
            }
        }
        return res;
    }
}