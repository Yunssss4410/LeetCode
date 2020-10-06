package Easy;

public class LC771 {
    /*
    771. 宝石与石头
     */
    class Solution {
        public int numJewelsInStones(String J, String S) {
            boolean[] Jb=new boolean[58];
            for (char c : J.toCharArray()) {
                Jb[c-'A']=true;
            }
            int res=0;
            for (char c : S.toCharArray()) {
                if (Jb[c-'A']) res++;
            }

            return res;
        }
    }
}
