package Easy;

public class LC643 {
    /*
    643. 子数组最大平均数 I
     */
    class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double ksum=0;
            for (int i = 0; i < k; i++) {
                ksum+=nums[i];
            }
            double max=ksum;
            for (int i = k; i < nums.length; i++) {
                ksum=ksum+nums[i]-nums[i-k];
                max=Math.max(max,ksum);
            }
            return max/k;
        }
    }
}
