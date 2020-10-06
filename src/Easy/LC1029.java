package Easy;

import java.util.Arrays;

public class LC1029 {
    /*
    1029. 两地调度
     */
    class Solution {
        public int twoCitySchedCost(int[][] costs) {
            Arrays.sort(costs, (o1, o2) -> ((o1[0]-o1[1])-(o2[0]-o2[1])));
            int res=0;
            int len=costs.length;
            for (int i = 0; i < len/2; i++) {
                res+=(costs[i][0]+costs[len-1-i][1]);
            }
            return res;
        }
    }
}
