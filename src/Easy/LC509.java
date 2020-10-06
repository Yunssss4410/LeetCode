package Easy;

public class LC509 {
    /*
    509. 斐波那契数
     */
    class Solution {
        public int fib(int N) {
            if (N==0 || N==1) return N;
            int fn1=0;
            int fn2=1;
            for (int i = 2; i <= N; i++) {
                int sum=fn1+fn2;
                fn1=fn2;
                fn2=sum;
            }
            return fn2;
        }
    }
}
