package Easy;

public class LC58 {
    /*
    58. 最后一个单词的长度
     */
    class Solution {
        public int lengthOfLastWord(String s) {
            s=s.trim();
            return s.substring(s.trim().lastIndexOf(" ")+1).length();
        }
    }
}
