package Easy;

import java.util.*;

public class LCM50 {
    /*
    面试题50. 第一个只出现一次的字符
     */
    class Solution {
        public char firstUniqChar(String s) {
            HashMap<Character,Boolean> map=new HashMap<>();
            for (Character character : s.toCharArray()) {
                map.put(character, !map.containsKey(character));
            }

            for (char c : s.toCharArray()) {
                if (map.get(c)) return c;
            }
            return ' ';
        }
    }
}
