package Easy;

public class LC521 {
    /*
    521. 最长特殊序列 Ⅰ
     */
    class Solution {
        public int findLUSlength(String a, String b) {
            if (a.equals(b)) return -1;
            return Math.max(a.length(),b.length());
        }
    }
}
