package Easy;

import java.util.ArrayList;

public class LC500 {
    /*
    500. 键盘行
     */
    class Solution {
        int[] ints=new int[]{1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2};
        public String[] findWords(String[] words) {
            ArrayList<String> list=new ArrayList<>();
            for (String word : words) {
                if (canInput(word.toLowerCase())) list.add(word);
            }
            String[] strings=new String[list.size()];
            list.toArray(strings);
            return strings;
        }

        public boolean canInput(String word) {
            int i=ints[word.charAt(0)-'a'];
            for (char c : word.toCharArray()) {
                if (ints[c-'a'] != i) return false;
            }
            return true;
        }
    }
}
