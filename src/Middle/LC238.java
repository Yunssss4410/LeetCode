package Middle;

public class LC238 {
    /*
    238. 除自身以外数组的乘积
     */
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int len=nums.length;
            int[] right=new int[len];
            right[len-1]=1;
            for (int i = len-2; i >= 0 ; i--) {
                right[i]=right[i+1]*nums[i+1];
            }
            int k=1;
            for (int i = 1; i < len; i++) {
                k=k*nums[i-1];
                right[i]=k*right[i];
            }

            return right;
        }
    }
}
