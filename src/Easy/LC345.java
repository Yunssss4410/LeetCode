package Easy;

import java.util.Set;

public class LC345 {
    /*
    345. 反转字符串中的元音字母
     */
    class Solution {
        public String reverseVowels(String s) {
            char[] chars=s.toCharArray();
            int start=0,end=s.length()-1;
            while (start < end) {
                if (!isYuanyin(chars[start])) start++;
                else if (!isYuanyin(chars[end])) end--;
                else {
                    char temp=chars[start];
                    chars[start]=chars[end];
                    chars[end]=temp;
                    start++;
                    end--;
                }
            }
            return new String(chars);
        }

        public boolean isYuanyin(char c) {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': return true;
                default: return false;
            }
        }
    }
}
