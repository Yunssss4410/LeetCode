package Easy;

import java.util.Arrays;

public class LC389 {
    /*
    389. 找不同
     */
    class Solution {
        public char findTheDifference(String s, String t) {
            int sum1=0;
            int sum2=0;
            for (int i = 0; i < s.length(); i++) {
                sum1+=s.charAt(i);
                sum2+=t.charAt(i);
            }
            sum2+=t.charAt(t.length()-1);
            return (char) (sum2-sum1);
        }
    }
}
