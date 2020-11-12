package Hard;

import java.util.ArrayList;
import java.util.List;

public class LC57 {
    /*
    57. 插入区间
     */
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> ans=new ArrayList<>();
            int len=intervals.length;
            int index=0;
            //左边区间
            while (index < len && intervals[index][1] < newInterval[0]) {
                ans.add(intervals[index]);
                index++;
            }

            while (index < len && intervals[index][0] <= newInterval[1])
            {
                newInterval[0]=Math.min(intervals[index][0],newInterval[0]);
                newInterval[1]=Math.max(intervals[index][1],newInterval[1]);
                index++;
            }
            ans.add(newInterval);

            while (index < len) {
                ans.add(intervals[index]);
                index++;
            }

            int[][] res=new int[ans.size()][2];
            for (int i = 0; i < ans.size(); i++) {
                res[i]=ans.get(i);
            }
            return res;
        }
    }
}
