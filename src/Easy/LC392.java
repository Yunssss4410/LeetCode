package Easy;

public class LC392 {
    /*
    392. 判断子序列
     */
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int i=0;
            int j=0;
            while (i < s.length() && j < t.length())
            {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                    j++;
                }else j++;
            }
            return i==s.length()+1;
        }
    }
}
