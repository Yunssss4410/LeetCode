package Middle;

public class LC306 {
    /*
    306. 累加数
     */
    class Solution {
        public boolean isAdditiveNumber(String num) {
            if (num.length() < 3) return false;
            for (int i = 1; i < num.length() / 2; i++) {
                for (int j = i+1; j < num.length(); j++) {
                    if (dfs(num,0,i,j)) return true;
                }
            }
            return false;
        }

        public boolean dfs(String num,int one,int two,int three) {
            if (num.startsWith("0", one) || num.startsWith("0", two)) return false;
            if (three == num.length()-1) return true;
            int onenum=Integer.parseInt(num.substring(one,two));
            int twonum=Integer.parseInt(num.substring(two,three));
            StringBuilder builder=new StringBuilder();
            for (int i = three; i < num.length(); i++) {
                builder.append(num.charAt(i));
                if (Integer.parseInt(builder.toString()) == (onenum+twonum)) {
                    return dfs(num,two,three,i+1);
                }
            }
            return false;
        }
    }
}
