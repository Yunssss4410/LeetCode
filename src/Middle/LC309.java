package Middle;

public class LC309 {
    /*
    309. 最佳买卖股票时机含冷冻期
     */
    class Solution {
        public int maxProfit(int[] prices) {
            int len=prices.length;
            if (len < 2) return 0;

            int[] sold=new int[len]; //当天不持股
            int[] hold=new int[len]; //当天持股
            int[] ice=new int[len];  //当天冷冻期

            sold[0]=0;
            hold[0]=-prices[0]; //第一天只能买股，亏空
            ice[0]=0;

            for (int i = 1; i < len; i++) {
                sold[i]=Math.max(sold[i-1],hold[i-1]+prices[i]); //今天还是不买/今天出股了
                hold[i]=Math.max(hold[i-1],ice[i-1]-prices[i]);  //继续持股/入股
                ice[i]=sold[i-1];
            }
            return Math.max(sold[len-1],ice[len-1]);
        }
    }
}
