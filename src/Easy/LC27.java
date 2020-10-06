package Easy;

public class LC27 {
    /*
    27. 移除元素
     */
    class Solution {
        public int removeElement(int[] nums, int val) {
            int index=0;
            int len=nums.length;
            int res=len;
            for (int i = 0; i < len; i++) {
                if (nums[i] != val) {
                    nums[index++]=nums[i];
                }else res--;
            }
            return res;
        }
    }
}
