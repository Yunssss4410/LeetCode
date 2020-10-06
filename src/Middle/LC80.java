package Middle;

public class LC80 {
    /*
    80. 删除排序数组中的重复项 II
     */
    class Solution {
        public int removeDuplicates(int[] nums) {
            int index=0;
            for (int num : nums) {
                if (index < 2 || num != nums[index-2])
                    nums[index++] = num;
            }
            return index;
        }
    }
}
