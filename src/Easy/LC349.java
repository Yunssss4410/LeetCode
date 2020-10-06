package Easy;

import java.util.Arrays;
import java.util.HashSet;

public class LC349 {
    /*
    349. 两个数组的交集
     */
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> hashSet=new HashSet<>();
            HashSet<Integer> hashSet2=new HashSet<>();
            for (int i : nums1) {
                hashSet.add(i);
            }
            for (int i : nums2) {
                if (hashSet.contains(i)) hashSet2.add(i);
            }
            int[] res=new int[hashSet2.size()];
            int i=0;
            for (Integer integer : hashSet2) {
                res[i++]=integer;
            }
            return res;
        }
    }
}
