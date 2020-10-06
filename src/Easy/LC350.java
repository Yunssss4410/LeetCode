package Easy;

import java.util.HashMap;
import java.util.HashSet;

public class LC350 {
    /*
    350. 两个数组的交集 II
     */
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer> map1=new HashMap<>();
            HashMap<Integer,Integer> map2=new HashMap<>();
            for (int i : nums1) {
                map1.put(i,map1.getOrDefault(i,0)+1);
            }
            int len=0;
            for (int i : nums2) {
                if (map1.containsKey(i) && map1.get(i) > 0) {
                    map2.put(i,map2.getOrDefault(i,0)+1);
                    map1.put(i,map1.get(i)-1);
                    len++;
                }

            }
            int[] res=new int[len];
            int i=0;
            for (Integer integer : map2.keySet()) {
                len=map2.get(integer);
                for (int j = 0; j < len; j++) {
                    res[i++]=integer;
                }
            }
            return res;
        }
    }
}
