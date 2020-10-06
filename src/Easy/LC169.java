package Easy;

import java.util.HashMap;
import java.util.Map;

public class LC169 {
    /*
    169. 多数元素
     */
    class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer,Integer> map=new HashMap<>();
            for (int num : nums) {
                int val=map.getOrDefault(num,0)+1;
                if (val > nums.length/2) return num;
                map.put(num,val);
            }
            return 0;
        }
    }
}
