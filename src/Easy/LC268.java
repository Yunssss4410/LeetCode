package Easy;

import java.util.Arrays;

public class LC268 {
    /*
    268. 缺失数字
     */
    class Solution {
        public int missingNumber(int[] nums) {
            int realsum=0;
            for (int num : nums) {
                realsum+=num;
            }
            int n=nums.length;
            return n+n*(n-1)/2-realsum;
        }
    }
}
