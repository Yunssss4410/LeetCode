package Easy;

public class LC376 {
    /*
    367. 有效的完全平方数
     */
    class Solution {
        public boolean isPerfectSquare(int num) {
            if (num < 2) return true;
            long left=2,right=num/2;
            while (left<=right)
            {
                long mid=left+(right-left)/2;
                long pow=mid*mid;
                if (pow == num) return true;
                if (pow > num) {
                    right=mid-1;
                }else {
                    left=mid+1;
                }
            }
            return false;
        }
    }
}
