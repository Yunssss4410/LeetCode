package Easy;

import java.util.HashMap;

public class LC205 {
    public static void main(String[] args) {
        boolean b = new Solution().isIsomorphic("paper", "tdtle");
        System.out.println(b);
    }

    /*
    205. 同构字符串
     */
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            char curcha = 'A';
            char curcha2 = 'A';
            char[] map = new char[127];
            char[] map2 = new char[127];

            for (int i = 0; i < s.length(); i++) {
                int c = s.charAt(i);
                if (map[c] == '\0')
                    map[c] = curcha++;

                int c2 = t.charAt(i);
                if (map2[c2] == '\0')
                    map2[c2] = curcha2++;

                if (map[c] != map[c2]) return false;
            }
            return true;
        }
    }
}
