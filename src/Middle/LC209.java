package Middle;

public class LC209 {
    /*
    209. 长度最小的子数组
     */
    class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            int len=0;
            int sum=0;
            int start=0;
            int res=Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                len++;
                while (sum >= s) {
//                    res=Math.min(res,len--);
                    res=res>len?len:res;
                    len--;
                    sum -= nums[start++];
                }
            }
            return res==Integer.MAX_VALUE?0:res;
        }
    }
}
