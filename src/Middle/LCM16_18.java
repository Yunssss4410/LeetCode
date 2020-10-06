package Middle;

import java.util.HashMap;

public class LCM16_18 {
    /*
    面试题 16.18. 模式匹配
     */
    class Solution {
        public boolean patternMatching(String pattern, String value) {
            int len1=pattern.length()-1;
            StringBuilder builder=new StringBuilder(value);
            for (int i = 0; i < len1; i++) {

            }
            return false;

        }

        //290.题判断字符串
        public boolean wordPattern(String pattern, String str) {
            String[] strings = str.split(" ");
            if (pattern.length() != strings.length) return false;
            char curch = 'a';
            HashMap<String,Character> map=new HashMap<>();
            StringBuilder builder = new StringBuilder();

            char curch2 = 'a';
            char[] map2 = new char[127];
            StringBuilder builder2 = new StringBuilder();
            for (int i = 0; i < pattern.length(); i++) {
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i],curch);
                    builder.append(curch++);
                }else {
                    builder.append(map.get(strings[i]));
                }

                int c2 = pattern.charAt(i);
                if (map2[c2] == '\0')
                    map2[c2] = curch2++;
                builder2.append(map2[c2]);

            }
            return builder.toString().equals(builder2.toString());
        }
    }
}
