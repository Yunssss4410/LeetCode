package Easy;

public class LC122 {
    /*
    122. 买卖股票的最佳时机 II
     */
    class Solution {
        public int maxProfit(int[] prices) {
            int len = prices.length;
            if (len < 1) return 0;
            int[] sold = new int[len];
            int[] hold = new int[len];
            hold[0] = -prices[0];
            sold[0] = 0;
            for (int i = 1; i < prices.length; i++) {
                hold[i] = Math.max(hold[i - 1], sold[i - 1] - prices[i]);
                sold[i] = Math.max(sold[i - 1], hold[i - 1] + prices[i]);
            }
            return Math.max(hold[len - 1], sold[len - 1]);
        }
        //超离谱解法
//        public int maxProfit(int[] prices) {
//            int maxprofit = 0;
//            for (int i = 1; i < prices.length; i++) {
//                if (prices[i] > prices[i - 1])
//                    maxprofit += prices[i] - prices[i - 1];
//            }
//            return maxprofit;
//        }

    }
}
