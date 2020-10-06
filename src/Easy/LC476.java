package Easy;

public class LC476 {
    /*
    476. 数字的补数
     */
    class Solution {
        public int findComplement(int num) {
            int temp=num;
            int n=1;
            do {
                n= (n<<1) +1;
                temp = temp>>1;
            }while (temp > 0);
            return num^n;
        }
    }
}
