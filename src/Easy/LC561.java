package Easy;

import java.util.Arrays;

public class LC561 {
    /*
    561. 数组拆分 I
     */
    class Solution {
        public int arrayPairSum(int[] nums) {
            Arrays.sort(nums);
            int sum=0;
            int n=nums.length;
            for (int i = 0; i < n; i+=2) {
                sum+=nums[i];
            }
            return sum;
        }
    }
}
