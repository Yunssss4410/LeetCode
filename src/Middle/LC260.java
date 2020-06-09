package Middle;

public class LC260 {
    /*
    260. 只出现一次的数字 III
     */
    class Solution {
        public int[] singleNumber(int[] nums) {
            int yuhuo=0;
            for (int num : nums) {
                yuhuo^=num;
            }
            int diff=yuhuo & (-yuhuo);
            int x=0;
            for (int num : nums) {
                if ((num&diff) == 0) {
                    x^=num;
                }
            }
            return new int[]{x,yuhuo^x};
        }
    }
}
