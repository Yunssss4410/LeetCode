package Easy;

import java.util.HashSet;
import java.util.Set;

public class LC217 {
    /*
    217. 存在重复元素
     */
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set=new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) return true;
                set.add(num);
            }
            return false;
        }
    }
}
