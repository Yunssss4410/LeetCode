package Easy;

public class LC189 {
    /*
    189. 旋转数组
     */
    class Solution {
        public void rotate(int[] nums, int k) {
            int len=nums.length;
            k=k%len;
            for (int i = 0; i < k; i++) {
                int prenum=nums[len-1];
                int temp;
                for (int j = 0; j < len; j++) {
                    temp=nums[j];
                    nums[j]=prenum;
                    prenum=temp;
                }
            }
        }
    }
}
