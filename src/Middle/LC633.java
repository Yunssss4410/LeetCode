package Middle;

public class LC633 {
    /*
    633. 平方数之和
     */
    class Solution {
        public boolean judgeSquareSum(int c) {
            int i = 0;
            int j = (int) Math.sqrt(c);
            while (i <= j) {
                int sum = i * i + j * j;
                if (sum == c)
                    return true;
                if (sum > c)
                    j--;        // sum > c : 整数 j 过大，导致 和 大于 整数 c
                else
                    i++;        // sum < c : 整数 i 过小，导致 和 小于 整数 c
            }
            return false;
        }
    }
}
