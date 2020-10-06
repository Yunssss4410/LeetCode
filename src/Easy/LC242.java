package Easy;

import java.util.Arrays;

public class LC242 {
    /*
    242. 有效的字母异位词
     */
    class Solution {
//        public boolean isAnagram(String s, String t) {
//            int l1=s.length(),l2=t.length();
//            if (l1 != l2) return false;
//            int[] scount=new int[26];
//            int[] tcount=new int[26];
//            for (int i = 0; i < l1; i++) {
//                scount[s.charAt(i)-'a']++;
//                tcount[t.charAt(i)-'a']++;
//            }
//            for (int i = 0; i < 26; i++) {
//                if (scount[i] != tcount[i]) return false;
//            }
//            return true;
//        }

        public boolean isAnagram(String s, String t){
            int l1=s.length(),l2=t.length();
            if (l1 != l2) return false;

            char[] c1=s.toCharArray();
            char[] c2=t.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            return Arrays.equals(c1,c2);
        }
    }
}
