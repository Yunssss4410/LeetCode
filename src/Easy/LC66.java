package Easy;

public class LC66 {
    /*
    66. 加一
     */
    class Solution {
        public int[] plusOne(int[] digits) {
            int cin=1;
            for (int i = digits.length - 1; i >= 0; i--) {
                digits[i]+=cin;
                cin = digits[i]/10;
                digits[i] = digits[i]%10;
                if (cin == 0) return digits;
            }
            digits = new int[digits.length+1];
            digits[0] = 1;
            return digits;
        }
    }
}
