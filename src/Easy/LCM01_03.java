package Easy;

public class LCM01_03 {
    /*
    面试题 01.03. URL化
     */
    class Solution {
        public String replaceSpaces(String S, int length) {
            StringBuilder stringBuilder=new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (S.charAt(i)==' ') stringBuilder.append("%20");
                else stringBuilder.append(S.charAt(i));
            }
            return stringBuilder.toString();
        }
    }

    class Solution_v2 {
        public String replaceSpaces(String S, int length) {
            char[] chars=new char[length*3];
            int index=0;
            for (int i = 0; i < length; i++) {
                char c=S.charAt(i);
                if (c == ' ') {
                    chars[index++]='%';
                    chars[index++]='2';
                    chars[index++]='0';
                }else {
                    chars[index++]=c;
                }
            }
            return new String(chars,0,index);
        }
    }
}
