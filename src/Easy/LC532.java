package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LC532 {
    /*
    532. 数组中的K-diff数对
     */
    class Solution {
        public int findPairs(int[] nums, int k) {
            if (k < 0) return 0;
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int num : nums) {
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int res=0;
            if (k == 0) {
                for (Integer value : map.values()) {
                    if (value > 1) res++;
                }
            }else {
                for (Integer integer : map.keySet()) {
                    if (map.containsKey(integer+k)) res++;
                }
            }
            return res;
        }
    }
}
