package Easy;

public class LC942 {
    /*
    942. 增减字符串匹配
    URL：https://leetcode-cn.com/problems/di-string-match/
     */
    class Solution {
        public int[] diStringMatch(String S) {
            int len=S.length();
            if (len<2) return new int[0];
            int[] ints=new int[len+1];
            int min=0,max=len;
            for (int i = 0; i < len; i++) {
                if (S.charAt(i)=='I') {
                    ints[i]=min++;
                }else {
                    ints[i]=max--;
                }
            }
            ints[len]=min;
            return ints;
        }

    }
}
