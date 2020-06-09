package Middle;

import java.util.Stack;

public class LC394 {
    /*
    394. 字符串解码
     */
    class Solution {
        public String decodeString(String s) {
            Stack<Integer> intstack=new Stack<>();
            Stack<String> strstack=new Stack<>();
            StringBuilder str=new StringBuilder();
            StringBuilder num=new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c>='0' && c<='9') {
                    num.append(c);
                }else if ((c>='a' && c<='z') || (c>='A' && c<='Z')) {
                    str.append(c);
                }else if (c=='[') {
                    intstack.push(Integer.valueOf(num.toString()));
                    strstack.push(str.toString());
                    str.setLength(0);
                    num.setLength(0);
                }else if (c==']') {
                    int k=intstack.pop();
                    StringBuilder tmp = new StringBuilder();
                    for (int i = 0; i < k; i++) {
                        tmp.append(str);
                    }
                    str.setLength(0);
                    str.append(strstack.pop()).append(tmp);
                }
            }
            return str.toString();
        }
    }
}
