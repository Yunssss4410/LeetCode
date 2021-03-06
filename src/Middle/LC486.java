package Middle;

public class LC486 {
    /*
    486. 预测赢家
     */
    class Solution {
        public boolean PredictTheWinner(int[] nums) {
            //排除偶数个必赢
            if (nums.length % 2 ==0) return true;

            int length = nums.length;
            int[][] dp = new int[length][length];   // 动态规划 所用数组，dp[i][j]表示：在nums数组的i到j下标区间内，先手玩家比后手玩家 “最大”多的数值

        /*
            初始化 dp数组的 已知结果
         */
            for (int i = 0; i < length; i++) {
                dp[i][i] = nums[i];
            }
            /*
            计算 dp数组：
                1、由于 dp[i][j] 是在 dp[i + 1][j] 和 dp[i][j - 1] 的基础上 计算出来的
                    因此，i从 最后一个元素开始，向前遍历，
                    但是，i如果为最后一个元素，就不会有元素排在其后，j则越界，
                    因此，i从倒数第二个元素开始
                2、 由于 为了保证区间的“合理性”(左边界 < 有边界)，
                    因此，j从i+1开始，向后遍历
         */
            for (int i = length - 2; i >= 0; i--) {
                for (int j = i + 1; j < length; j++) {
                    // 当前 dp[i][j]，分为两种情况：
                    //    1、先手玩家取nums[i]，则比后手多的值为：nums[i] - dp[i + 1][j]
                    //    2、先手玩家取nums[j]，则比后手多的值为：nums[j] - dp[i][j - 1]
                    dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
                }
            }

            return (dp[0][length - 1] >= 0);
        }
    }
}
