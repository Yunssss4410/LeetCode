package Hard;

public class LC214 {
    /*
    214. 最短回文串
     */
    class Solution {
        public String shortestPalindrome(String s){
            int n = s.length();
            char[] cs = s.toCharArray();
            int r = n / 2 ;
            while (r >= 0){
                if(isPa(cs, 0, r))  break;
                r--;
            }
            return new StringBuilder(s.substring(r + 1, n)).reverse().append(s).toString();
        }

        public boolean isPa(char[] cs, int l, int r){
            while (l < r) if(cs[l++] != cs[r--])    return false;
            return true;
        }
    }
}
