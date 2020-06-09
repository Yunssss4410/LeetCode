package Middle;

public class LC63 {
    /*
    63. 不同路径 II
     */
    static class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int R=obstacleGrid.length;
            if (R==0 || obstacleGrid[0][0]==1) return 0;
            int C=obstacleGrid[0].length;

            int[][] dp=new int[R][C];
            dp[0][0]=1;
            for (int i = 1; i < C; i++) {
                if (obstacleGrid[0][i]==0) {
                    dp[0][i]=dp[0][i-1];
                }
            }
            for (int i = 1; i < R; i++) {
                if (obstacleGrid[i][0]==0) {
                    dp[i][0]=dp[i-1][0];
                }
            }

            for (int i = 1; i < R; i++) {
                for (int j = 1; j < C; j++) {
                    if (obstacleGrid[i][j]==0) {
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }else {
                        dp[i][j]=0;
                    }
                }
            }

            return dp[R-1][C-1];
        }

    }
}
