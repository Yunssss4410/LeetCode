package Easy;

public class LC13 {
    /*
    13. 罗马数字转整数
     */
    class Solution {
        public int romanToInt(String s) {
            int res=0;
            for (int i = 0; i < s.length()-1; i++) {
                int c1=getValue(s.charAt(i));
                int c2=getValue(s.charAt(i+1));
                res+= c1>=c2?c1:-c1;
            }
            return res+getValue(s.charAt(s.length()-1));
        }

        private int getValue(char ch) {
            switch(ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default: return 0;
            }
        }
    }
}
