package Easy;

public class LC551 {
    /*
    551. 学生出勤记录 I
     */
    class Solution {
        public boolean checkRecord(String s) {
            int A=0;
            int L=0;
            for (char c : s.toCharArray()) {
                if (c == 'L')  L++;
                else L=0;
                if (L > 2) return false;

                if (c == 'A') A++;
                if (A > 1) return false;
            }
            return true;
        }
    }
    //一行解法
    //return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
}
