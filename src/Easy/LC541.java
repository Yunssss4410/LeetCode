package Easy;

public class LC541 {
    /*
    541. 反转字符串 II
     */
    class Solution {
        public String reverseStr(String s, int k) {
            char[] chars=s.toCharArray();
            for (int i = 0; i < chars.length; i+=2*k) {
                reverse(chars,i,i+k-1);
            }
            return new String(chars);
        }

        public void reverse(char[] chars,int start,int end){
            end=end<chars.length?end:chars.length-1;
            while (start < end)
            {
                char tmp=chars[start];
                chars[start]=chars[end];
                chars[end]=tmp;
                start++;
                end--;
            }
        }
    }
}
