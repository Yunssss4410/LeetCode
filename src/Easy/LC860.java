package Easy;

public class LC860 {
    /*
    860. 柠檬水找零
     */
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            int money5=0;
            int money10=0;
            for (int bill : bills) {
                if (bill==5)
                    money5++;
                else if (bill==10) {
                    money10++;
                    money5--;
                }else {
                    if (money10 > 0) {
                        money10--;
                        money5--;
                    }else {
                        money5-=3;
                    }
                }
                if (money5 < 0 || money10 < 0) return false;
            }
            return true;
        }
    }
}
