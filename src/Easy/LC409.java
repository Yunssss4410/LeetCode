package Easy;

public class LC409 {
    /*
    409. 最长回文串
     */
    class Solution {
        public int longestPalindrome(String s) {
            int[] chars = new int[127];
            for (char c : s.toCharArray()) {
                chars[c]++;
            }
            int res = 0;
            for (int aChar : chars) {
                res += aChar / 2 * 2;
                if (aChar % 2 == 1 && res % 2 == 0)
                    res++;
            }
            return res;
        }
    }
}
