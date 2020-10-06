package Middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC17 {
    /*
    17. 电话号码的字母组合
     */
    class Solution {
        Map<Integer, String> phone = new HashMap<Integer, String>() {{
            put(2, "abc");
            put(3, "def");
            put(4, "ghi");
            put(5, "jkl");
            put(6, "mno");
            put(7, "pqrs");
            put(8, "tuv");
            put(9, "wxyz");
        }};
        List<String> list=new ArrayList<>();
        public List<String> letterCombinations(String digits) {
            if (digits.length() < 1) return list;
            dfs(digits,0,new StringBuilder());
            return list;
        }

        public void dfs(String digits,int index,StringBuilder builder) {
            if (index == digits.length()) {
                list.add(builder.toString());
                return;
            }
            int num=digits.charAt(index)-'0';
            String s=phone.get(num);
            for (char c : s.toCharArray()) {
                builder.append(c);
                dfs(digits,index+1,builder);
                builder.deleteCharAt(index);
            }
        }
    }
}
