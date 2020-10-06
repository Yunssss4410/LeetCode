package Easy;

public class LC125 {
    public static void main(String[] args) {
        new Solution().isPalindrome("A man, a plan, a canal: Panama");
    }
    /*
    125. 验证回文串
     */
    static class Solution {
        public boolean isPalindrome(String s) {
            s=s.toLowerCase();
            StringBuilder builder=new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c >= '0' && c <= '9' || c>='a' && c<='z') builder.append(c);
            }
            s=builder.toString();
            int len=builder.length();
            for (int i = 0; i < len/2; i++) {
                if (s.charAt(i) != s.charAt(len-1-i)) return false;
            }
            return true;
        }
    }
}
