package Easy;

public class LC482 {
    /*
    482. 密钥格式化
     */
    class Solution {
        public String licenseKeyFormatting(String S, int K) {
            StringBuilder builder=new StringBuilder();
            char[] chars=S.toCharArray();
            int len=S.length();
            int index=K+1;
            while (len-- > 0)
            {
                if (chars[len] == '-') continue;
                if (--index == 0) {
                    index=K;
                    builder.insert(0,'-');
                }
                if (chars[len] >= 'a' && chars[len] <= 'z') {
                    chars[len] -= 32;
                }
                builder.insert(0,chars[len]);
            }
            return builder.toString();
        }
    }
}
