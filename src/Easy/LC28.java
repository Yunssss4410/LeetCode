package Easy;

public class LC28 {
    /*
    28. 实现 strStr()
     */
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.equals("")) return 0;
            int L = needle.length(), n = haystack.length();

            for (int start = 0; start <= n - L; start++) {
                if (haystack.charAt(start)==needle.charAt(0) && haystack.substring(start, start + L).equals(needle)) {
                    return start;
                }
            }
            return -1;
        }
    }
}
