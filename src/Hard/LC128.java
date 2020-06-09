package Hard;

import java.util.HashSet;

public class LC128 {
    /*
    128. 最长连续序列
     */
    class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length<1) return 0;
            HashSet<Integer> set=new HashSet<>();
            for (int num : nums) {
                set.add(num);
            }
            int res=1;
            for (Integer num : set) {
                if (!set.contains(num)) {
                    int currentnum = num;
                    int currentlen = 1;
                    while (set.contains(currentnum + 1)) {
                        currentnum++;
                        currentlen++;
                    }
                    res = Math.max(res, currentlen);
                }
            }
            return res;
        }
    }
}
