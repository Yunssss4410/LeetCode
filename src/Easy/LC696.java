package Easy;

public class LC696 {
    public static void main(String[] args) {
        new Solution().countBinarySubstrings("00110011");
    }
    /*
    696. 计数二进制子串
     */
    static class Solution {
        public int countBinarySubstrings(String s) {
            int len=s.length();
            char[] chars=s.toCharArray();
            int res=0;
            int prelen=0;
            int curlen=1;
            for (int i = 1; i < len; i++) {
                if (chars[i]==chars[i-1]) curlen++;
                else {
                    if (prelen != 0) {
                        res+=Math.min(prelen,curlen);
                    }
                    prelen=curlen;
                    curlen=1;
                }
                if (i == len-1) res+=Math.min(prelen,curlen);
            }
            return res;
        }
    }
}
