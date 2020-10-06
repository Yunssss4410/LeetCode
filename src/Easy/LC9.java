package Easy;

public class LC9 {
    public static void main(String[] args) {
        String string="1123";
        System.out.println();
    }
    /*
    9. 回文数
     */
    class Solution {
        public boolean isPalindrome(int x) {
            if (x<0 || (x%10==0 && x!=0)) return false;

            int reverseNum=0;
            while (x > reverseNum) {
                reverseNum=reverseNum*10+x%10;
                x=x/10;
            }

            return reverseNum==x || reverseNum/10==x;
        }
    }
}
