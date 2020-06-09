package Easy;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class LC645 {
    /*
    645. 错误的集合
     */
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int[] num=new int[nums.length+1];
            for (int re : nums) {
                num[re]++;
            }
            int[] res=new int[2];
            for (int i = 0; i < num.length; i++) {
                if (num[i]==2) res[0]=i;
                else if (num[i]==0) res[1]=i;
            }
            return res;
        }
    }
}
