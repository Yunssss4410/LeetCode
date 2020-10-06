package Easy;

public class LC299 {
    /*
    299. 猜数字游戏
     */
    class Solution {
        public String getHint(String secret, String guess) {
            char[] charsecret=secret.toCharArray();
            char[] charguess=guess.toCharArray();
            int[] num1=new int[10];
            int[] num2=new int[10];

            int Bulls=0;
            for (int i = 0; i < charguess.length; i++) {
                if (charsecret[i]==charguess[i]) Bulls++;
                num1[charsecret[i]-'0']++;
                num2[charguess[i]-'0']++;
            }
            int Cows=0;
            for (int i = 0; i < 10; i++) {
                Cows+=Math.min(num1[i],num2[i]);
            }

            return new StringBuilder().append(Bulls).append('A').append(Cows-Bulls).append('B').toString();
        }
    }
}
