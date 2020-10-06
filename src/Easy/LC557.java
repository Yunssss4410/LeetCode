package Easy;

public class LC557 {
    /*
    557. 反转字符串中的单词 III
     */
    class Solution {
        public String reverseWords(String s) {
            String[] strings=s.split(" ");
            StringBuilder builder=new StringBuilder();
            for (String string : strings) {
                builder.append(new StringBuffer(string).reverse()).append(" ");
            }
            builder.setLength(builder.length()-1);
            return builder.toString();
        }
    }
}
