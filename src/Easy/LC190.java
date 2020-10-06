package Easy;

public class LC190 {
    /*
    190. 颠倒二进制位
     */
    static class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int res = 0;
            for (int i = 0; i < 32; i++) {
                res=res*2+n&1;
                n >>= 1;
            }
            return res;
        }
    }
}
