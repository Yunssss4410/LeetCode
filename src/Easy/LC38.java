package Easy;

public class LC38 {
    /*
    38. 外观数列
     */
    class Solution {
        public String countAndSay(int n) {
            String str="1";
            for (int i = 2; i <= n; i++) {
                StringBuilder stringBuilder=new StringBuilder();
                int curclen=1;
                for (int j = 1; j < str.length(); j++) {
                    char pre=str.charAt(j-1);
                    char cur=str.charAt(j);
                    if (cur == pre) curclen++;
                    else {
                        stringBuilder.append(curclen).append(pre);
                        curclen=1;
                    }
                }
                stringBuilder.append(curclen).append(str.charAt(str.length()-1));
                str=stringBuilder.toString();
            }
            return str;
        }
    }
}
