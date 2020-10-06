package Middle;

public class LC848 {
    /*
    848. 字母移位
     */
    class Solution {
        public String shiftingLetters(String S, int[] shifts) {
            int len=shifts.length;
            int count=0;
            char[] chars=S.toCharArray();
            for (int i = len-1; i >= 0; i--) {
                count+= shifts[i] % 26;
                chars[i]= (char) (((chars[i]-'a')+count)%26 + 'a');
            }
            return new String(chars);
        }
    }
}
