package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LC290 {
    public static void main(String[] args) {
        new Solution().wordPattern("abba","dog cat cat dog");
    }
    /*
    290. 单词规律
     */
    static class Solution {
        public boolean wordPattern(String pattern, String str) {
            String[] strings = str.split(" ");
            if (pattern.length() != strings.length) return false;
            char curch = 'a';
            char curch2 = 'a';
            HashMap<String,Character> map=new HashMap<>();
            char[] map2 = new char[127];
            StringBuilder builder = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();
            for (int i = 0; i < pattern.length(); i++) {
                if (!map.containsKey(strings[i])) {
                    map.put(strings[i],curch);
                    builder.append(curch);
                    curch++;
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
