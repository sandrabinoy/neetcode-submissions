/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() < 2) return true;
        for (int i = 0; i < intervals.size(); i++) {
            int end = intervals.get(i).end;
            for (int j = i + 1; j < intervals.size(); j++) {
                int start = intervals.get(j).start;
                if (start < end) return false;
            }
        }
        return true;
    }
}
