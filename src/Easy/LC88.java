package Easy;

public class LC88 {
    /*
    88. 合并两个有序数组
     */
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int index=m-- +n-- -1;
            while (m >= 0 && n >= 0)
                nums1[index--]=nums1[m] > nums2[n]?nums1[m--]:nums2[n--];
            while (n >= 0)
                nums1[index--]=nums2[n--];
        }
    }
}
