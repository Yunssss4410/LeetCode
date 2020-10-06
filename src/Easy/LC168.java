package Easy;

public class LC168 {
    /*
    168. Excel表列名称
     */
    class Solution {
        public String convertToTitle(int n) {
            if (n < 0) return "";
            StringBuilder builder=new StringBuilder();
            while (n > 0)
            {
                n--;
                char c= (char) (n%26+'A');
                if (c >='A' && c<='Z') {
                    builder.insert(0,c);
                }
                n=n/26;
            }
            return builder.toString();
        }
    }
}
