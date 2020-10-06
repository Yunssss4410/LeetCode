package Easy;

import java.util.HashSet;
import java.util.Set;

public class LCM61 {
    /*
    面试题61. 扑克牌中的顺子
     */
    class Solution {
        public boolean isStraight(int[] nums) {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            Set<Integer> set=new HashSet<>();
            for (int num : nums) {
                if (num!=0) {
                    min=Math.min(min,num);
                    max=Math.max(max,num);
                    if (set.contains(num)){
                        return false;
                    }
                    set.add(num);
                }
            }
            return (max-min <= 4);
        }
    }
}
