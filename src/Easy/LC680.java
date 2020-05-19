package Easy;

public class LC680 {
    public static void main(String[] args) {
        String s="abcaba";
        System.out.println(new Solution().validPalindrome(s));
    }
    /*
    680. 验证回文字符串 Ⅱ
    URL：https://leetcode-cn.com/problems/valid-palindrome-ii/
     */
    static class Solution {
        private boolean count=false;
        public boolean validPalindrome(String s) {
            int left=0,right=s.length()-1;
            while (left<right)
            {
                if (s.charAt(left)==s.charAt(right)){
                    left++;
                    right--;
                }else {
                    if (count) return false;
                    count=true;
                    return validPalindrome(s.substring(left+1,right+1)) || validPalindrome(s.substring(left,right));
                }
            }
            return true;
        }
    }
}
