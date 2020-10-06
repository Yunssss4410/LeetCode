package Middle;

public class LC29 {
    /*
    29. 两数相除
     */
    class Solution {
        public int divide(int dividend, int divisor) {
            int i = 0;
            boolean sign = true;
            sign = (dividend < 0) == sign == (divisor < 0);
            long d1=Math.abs(dividend);
            long d2=Math.abs(divisor);
            while (d1 >= d2) {
                d1 -= d2;
                i++;
            }
            return sign ? i : -i;
        }


    }
}
