package Middle;

public class LC91 {
    /*
    91. 解码方法
     */
    class Solution {
        public int numDecodings(String s) {
            int n = s.length();
            if (s.charAt(0) == '0') return 0;
            if (n < 2) return 1;
            int[] dp = new int[n + 1];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                int num1 = s.charAt(i - 2) - '0';
                int num2 = s.charAt(i - 1) - '0';
                int sum = num1 * 10 + num2;
                if (num2 == 0) {
                    if (num1 == 0 || sum > 26)
                        dp[i] = 0;
                    else
                        dp[i] = dp[i - 2];
                } else if (sum <= 26 && sum >= 10) dp[i] = dp[i - 1] + dp[i - 2];
                else dp[i] = dp[i - 1];
            }
            return dp[n];
        }
    }
}
