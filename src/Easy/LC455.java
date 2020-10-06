package Easy;

import java.util.Arrays;

public class LC455 {
    /*
    455. 分发饼干
     */
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            if (s.length < 1) return 0;
            Arrays.sort(g);
            Arrays.sort(s);
            int i=0,j=0,count=0;
            while (i < g.length && j < s.length)
            {
                if (s[j] >= g[i]) {
                    i++;
                    count++;
                }
                j++;
            }
            return count;
        }
    }
}
