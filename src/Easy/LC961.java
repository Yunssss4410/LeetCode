package Easy;

import java.util.HashSet;

public class LC961 {
    /*
    961. 重复 N 次的元素
     */
    class Solution {
        public int repeatedNTimes(int[] A) {
            HashSet<Integer> set=new HashSet<>();
            for (int i : A) {
                if (set.contains(i))
                    return i;
                else
                    set.add(i);
            }
            return 0;
        }
    }
}
