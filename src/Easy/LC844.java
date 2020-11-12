package Easy;

public class LC844 {
    /*
    844. 比较含退格的字符串
     */
    class Solution {
        public boolean backspaceCompare(String S, String T) {
            return build(S).equals(build(T));
        }

        public String build(String string) {
            StringBuilder sb=new StringBuilder( );
            for (char c : string.toCharArray()) {
                if (c != '#')
                    sb.append(c);
                else if (sb.length() > 0)
                    sb.deleteCharAt(sb.length()-1);
            }
            return sb.toString();
        }
    }
}
