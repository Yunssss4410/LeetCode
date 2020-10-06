package Easy;

public class LC35 {
    public static void main(String[] args) {
        int num=new Solution().searchInsert(new int[]{1,3,5,6},2);
        System.out.println(num);
    }
    /*
    35. 搜索插入位置
     */
    static class Solution {
        public int searchInsert(int[] nums, int target) {
            int left=0;
            int right=nums.length-1;
            int res=0;
            while (left<right)
            {
                int mid=left+(right-left+1)/2;
                if (nums[mid] == target) return mid;
                if (target > nums[mid]){
                    left=mid;
                }else {
                    right=mid-1;
                }
            }
            return nums[left] < target ? left+1 : left;
        }
    }
}
