package Middle;

public class LC647 {
    public static void main(String[] args) {
        new Solution().countSubstrings("aaa");
    }
    /*
    647. 回文子串
     */
    static class Solution {
        public int countSubstrings(String s) {
            int res=0;
            int len=s.length();
            for (int i = 0; i < len; i++) {
                res++;
                int left=i-1;
                int right=i+1;
                while (left>=0 && right<len && s.charAt(left)==s.charAt(right))
                {
                    res++;
                    left--;
                    right++;
                }
                left=i;
                right=i+1;
                while (left>=0 && right<len && s.charAt(left)==s.charAt(right))
                {
                    res++;
                    left--;
                    right++;
                }
            }
            return res;
        }
    }
}
