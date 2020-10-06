package Easy;

public class LC485 {
    /*
    485. 最大连续1的个数
     */
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count=0;
            int res=0;
            for (int num : nums) {
                if (num==1) {
                    count++;
                }else {
                    res=Math.max(count,res);
                    count=0;
                }
            }
            return Math.max(res,count);
        }
    }
}
