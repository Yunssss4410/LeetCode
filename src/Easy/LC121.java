package Easy;

public class LC121 {
    /*
    121. 买卖股票的最佳时机
     */
    class Solution {
        public int maxProfit(int[] prices) {
            int len=prices.length;
            if (len < 2) return 0;
            int min=prices[0];
            int res=0;
            for (int i = 1; i < prices.length; i++) {
                res=Math.max(res,prices[i]-min);
                min=Math.min(min,prices[i]);
            }
            return res;
        }
    }
}
