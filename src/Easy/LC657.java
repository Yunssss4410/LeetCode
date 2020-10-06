package Easy;

public class LC657 {
    /*
    657. 机器人能否返回原点
     */
    class Solution {
        public boolean judgeCircle(String moves) {
            int r = 0;
            int l = 0;
            for (char c : moves.toCharArray()) {
                switch (c) {
                    case 'U':
                        l++;
                        break;
                    case 'D':
                        l--;
                        break;
                    case 'L':
                        r--;
                        break;
                    case 'R':
                        r++;
                        break;
                }
            }
            return l == 0 && r == 0;
        }
    }
}
