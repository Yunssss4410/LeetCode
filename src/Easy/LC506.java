package Easy;

import java.util.HashMap;
import java.util.TreeMap;

public class LC506 {
    /*
    506. 相对名次
     */
    class Solution {
        public String[] findRelativeRanks(int[] nums) {
            String[] res=new String[nums.length];
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i],i);
            }
            int i=nums.length;
            for (Integer value : map.values()) {
                res[value]=cj(i--);
            }
            return res;
        }

        public String cj(int n) {
            if(n==1) return "Gold Medal";
            if(n==2) return "Silver Medal";
            if(n==3) return "Bronze Medal";
            else return String.valueOf(n);
        }
    }
}
