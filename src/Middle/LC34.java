package Middle;

public class LC34 {
    /*
    34. 在排序数组中查找元素的第一个和最后一个位置
     */
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int first=-1,last=-1;
            {
                int left = 0;
                int right = nums.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (nums[mid] >= target) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                if (left != nums.length && nums[left] == target)
                    first = left;

            }
            {
                int left = 0;
                int right = nums.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (nums[mid] <= target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
                if (right != -1 && nums[right] == target)
                    last = right;

            }
            return new int[]{first,last};
        }
    }
}
