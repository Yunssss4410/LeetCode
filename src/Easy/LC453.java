package Easy;

import java.util.Arrays;

public class LC453 {
    /*
    453. 最小移动次数使数组元素相等
    完全看不懂
     */
    class Solution {
        public int minMoves(int[] nums) {
            Arrays.sort(nums);
            int count = 0;
            for (int i = nums.length - 1; i > 0; i--) {
                count += nums[i] - nums[0];
            }
            return count;
        }
    }
}
