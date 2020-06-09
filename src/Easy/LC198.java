package Easy;

public class LC198 {
    /*
    198. 打家劫舍
     */
    class Solution {
        public int rob(int[] nums) {
            int len=nums.length;
            if (len<1) return 0;
            int[] dp=new int[len];
            dp[0]=nums[0];
            dp[1]=Math.max(dp[0],nums[1]);
            for (int i = 2; i < len; i++) {
                dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            }
            return dp[len-1];
        }
    }
}
