package Easy;

public class LC374<Interface> {
    /*
    374. 猜数字大小
     */
    class Solution extends GuessGame {
        public int guessNumber(int n) {
            int left=1,right=n;
            while (left < right) {
                int mid=left+(right-left)/2;
                int ans=guess(mid);
                if (ans == 0) return mid;
                else if (ans == 1) {
                    left=mid+1;
                }else {
                    right=mid;
                }
            }
            return left;
        }

    }

    class GuessGame {
        int guess(int num) {
            return 0;
        }
    }

}

