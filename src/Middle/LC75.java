package Middle;

public class LC75 {
    /*
    75. 颜色分类
     */
    class Solution {
        public void sortColors(int[] nums) {
            int left=0;
            int cur=0;
            int right=nums.length-1;
            while (cur<right)
            {
                if (nums[cur]==0) {
                    nums[cur++]=nums[left];
                    nums[left++]=0;
                }else if (nums[cur]==2){
                    nums[cur]=nums[right];
                    nums[right--]=2;
                }else {
                    cur++;
                }
            }
        }
    }
}
