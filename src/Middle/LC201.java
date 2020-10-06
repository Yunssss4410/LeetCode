package Middle;

public class LC201 {
    /*
    201. 数字范围按位与
     */
    class Solution {
        public int rangeBitwiseAnd(int m, int n) {
            int move = 0;
            while (m != n) {
                m >>= 1;
                n >>= 1;
                move++;
            }
            return m << move;
        }
    }
}
