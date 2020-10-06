package Easy;

public class LC263 {
    /*
    263. 丑数
     */
    class Solution {
        public boolean isUgly(int num) {
            int[] chushu = new int[]{2, 3, 5};
            for (int i : chushu) {
                while (num % i == 0) {
                    num = num / i;
                }
            }
            return num == 1;
        }
    }
}
