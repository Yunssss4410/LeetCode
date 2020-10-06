package Easy;

public class LC441 {
    /*
    441. 排列硬币
     */
    class Solution {
        public int arrangeCoins(int n) {
            int i=1;
            while (n >= i)
            {
                n=n-i;
                i++;
            }
            return i-1;
        }
    }
}
