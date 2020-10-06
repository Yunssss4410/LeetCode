package Easy;

public class LC434 {
    /*
    434. 字符串中的单词数
     */
    class Solution {
        public int countSegments(String s) {
            s=s.trim();
            if (s.isEmpty()) return 0;
            return s.split("\\s+ ").length;
        }
    }
}
