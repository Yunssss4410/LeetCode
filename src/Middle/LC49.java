package Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LC49 {
    /*
    49. 字母异位词分组
     */
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> map=new HashMap<>();
            for (String str : strs) {
                String s=Dictionaryorder(str);
                if (map.containsKey(s))
                    map.get(s).add(str);
                else {
                    List<String> list=new ArrayList<>();
                    list.add(str);
                    map.put(s,list);
                }

            }
            return new ArrayList<>(map.values());
        }

        public String Dictionaryorder(String string) {
//            int[] chars=new int[26];
//            for (char c : string.toCharArray()) {
//                chars[c-'a']++;
//            }
//            StringBuilder sb=new StringBuilder();
//            for (int aChar : chars) {
//                sb.append(aChar+'a');
//            }
//            return sb.toString();

            char[] chars=string.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }
}
