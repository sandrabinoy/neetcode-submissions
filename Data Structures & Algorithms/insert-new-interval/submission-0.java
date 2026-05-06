class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0 && newInterval.length == 0) {
            return intervals;
        }
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        int l = 0, r = 0;
        int[][] output = new int[intervals.length + 1][2];
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] < newInterval[0]) {
                output[i] = interval;
            } else {
                l = i;
                break;
            }
        }
        output[l] = newInterval;
        for (int i = l; i < intervals.length; i++) {
            output[i+1] = intervals[i];
        }
        return output;
    }
}
