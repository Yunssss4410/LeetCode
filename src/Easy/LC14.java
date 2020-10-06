package Easy;

public class LC14 {
    /*
    14. 最长公共前缀
     */
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            int len=strs.length;
            if (len < 1) return "";
            int minfloor=Integer.MAX_VALUE;
            for (String str : strs) {
                minfloor=Math.min(str.length(),minfloor);
            }
            StringBuilder builder=new StringBuilder();
            int floor=0;
            while (floor < minfloor)
            {
                char c=strs[0].charAt(floor);
                int i;
                for (i = 1; i < len; i++) {
                    if (strs[i].charAt(floor) != c) break;
                }
                if (i==len) builder.append(c);
                else break;
                floor++;
            }
            return builder.toString();
        }
    }
}
