package Easy;

public class LC303 {
    /*
    303. 区域和检索 - 数组不可变
     */
    class NumArray {

        int[] sum;
        public NumArray(int[] nums) {
            sum=new int[nums.length+1];
            sum[0]=0;
            for (int i = 1; i < sum.length; i++) {
                sum[i]=nums[i-1]+sum[i-1];
            }
        }

        public int sumRange(int i, int j) {
            return sum[j+1]-sum[i-1];
        }
    }
}
