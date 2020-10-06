package Easy;

import java.util.ArrayList;
import java.util.List;

public class LC448 {
    /*
    448. 找到所有数组中消失的数字
     */
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n=nums.length;
            int[] ints=new int[n+1];
            for (int num : nums) {
                ints[num]++;
            }
            List<Integer> list=new ArrayList<>();
            for (int i = 1; i < n + 1; i++) {
                if (ints[i] == 0) list.add(i);
            }
            return list;
        }
    }
}
