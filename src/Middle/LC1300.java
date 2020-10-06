package Middle;

import java.util.Arrays;

public class LC1300 {
    public static void main(String[] args) {
        double a=1.9;
        System.out.println((int) a);
    }
    /*
    1300. 转变数组后最接近目标值的数组和
     */
    class Solution {
        public int findBestValue(int[] arr, int target) {
            Arrays.sort(arr);
            int len=arr.length;
            int sum=0;
            for (int i = 0; i < len; i++) {
                if (arr[i] >= (target-sum)/(len-i)) {
                    double floor= (target-sum)*1.0/(len-i);
                    return (int) (floor%1 > 0.5?floor+1:floor);
                }
                sum+=arr[i];
            }
            return arr[len-1];
        }
    }
}
