package Easy;

public class LC459 {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(s.indexOf("d"));
    }
    /*
    459. 重复的子字符串
     */
    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            return (s + s).substring(1, s.length() * 2 - 1).contains(s);
        }
    }
}
