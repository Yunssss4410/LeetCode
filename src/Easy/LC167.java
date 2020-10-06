package Easy;

public class LC167 {
    /*
    167. 两数之和 II - 输入有序数组
     */
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int i=0,j=numbers.length-1;
            int[] res=new int[2];
            while (i < j) {
                int sum=numbers[i]+numbers[j];
                if (sum == target) {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
                if (sum > target) j--;
                else i++;
            }
            return res;
        }
    }
}
