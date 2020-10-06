package Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC6 {
    public static void main(String[] args) {
        new Solution().convert("PAYPALISHIRING",3);
    }
    /*
    6. Z 字形变换
     */
    static class Solution {
        public String convert(String s, int numRows) {
            if (numRows <= 1) return s;
            List<StringBuilder> list=new ArrayList<>();
            int n = numRows * 2 - 2;
            for (int i = 0; i < s.length(); i++) {
                int row = i % n;
                row = row < numRows ? row : n - row;
                if (list.size() <= row) list.add(new StringBuilder());
                list.get(row).append(s.charAt(i));
            }
            StringBuilder builder = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                builder.append(list.get(i));
            }
            return builder.toString();
        }
    }
}
