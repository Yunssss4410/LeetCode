package Easy;

public class LC172 {
    /*
    172. 阶乘后的零
     */
    class Solution {
        public int trailingZeroes(int n) {
            int res=0;
            while (n!=0) {
                n=n/5;
                res+=n;
            }
            return res;
        }
    }
}
