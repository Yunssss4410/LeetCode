package Easy;

public class LC26 {
    /*
    26. 删除排序数组中的重复项
    URL：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     */
    class Solution {
        public int removeDuplicates(int[] nums) {
            int len=nums.length;
            if(len<1) return 0;
            int count=1,temp=nums[0];
            for (int i = 1; i < len; i++) {
                if (nums[i]!=temp){
                    nums[count++]=nums[i];
                    temp=nums[i];
                }
            }
            return count;
        }
    }
}
