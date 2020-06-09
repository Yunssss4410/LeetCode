package Middle;

import java.util.Arrays;
import java.util.Comparator;

public class LC435 {
    /*
    435. 无重叠区间
     */
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            if (intervals.length<1) return 0;
            Arrays.sort(intervals, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1]-o2[1];
                }
            });
            int count=0;
            int end=intervals[0][1];
            for (int i = 1; i < intervals.length; i++) {
                if (end > intervals[i][0]) {
                    count++;
                }else {
                    end = intervals[i][1];
                }
            }
            return count;
        }
    }
}
