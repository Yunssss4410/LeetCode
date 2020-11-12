package Middle;

import java.util.*;

public class LC763 {
    /*
    763. 划分字母区间
     */
    class Solution {
        public List<Integer> partitionLabels(String S) {
            if (S.length() < 1) return new ArrayList<>();
            int[] last = new int[26];
            int len=S.length();
            for (int i = 0; i < len; i++) {
                last[S.charAt(i)-'a']=i;
            }
            List<Integer> res=new ArrayList<>();
            int start=0;
            int end=0;
            for (int i = 0; i < len; i++) {
                end=Math.max(end,last[S.charAt(i)-'a']);
                if (i == end) {
                    res.add(end-start+1);
                    start=end+1;
                }
            }
            return res;
        }
    }
}
