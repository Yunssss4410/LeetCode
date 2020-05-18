package Middle;

public class LC152 {
    /*
    152. 乘积最大子数组
    URL：https://leetcode-cn.com/problems/maximum-product-subarray/
     */
    class Solution {
        public int maxProduct(int[] nums) {
            int max,min,res;
            res=max=min=nums[0];
            for (int i = 1; i < nums.length; i++) {
                int premax=max,premin=min;
                max=Math.max(Math.max(premin*nums[i],premax*nums[i]),nums[i]);
                min=Math.min(Math.min(premin*nums[i],premax*nums[i]),nums[i]);
                res=Math.max(res,max);
            }
            return res;
        }
    }
}
