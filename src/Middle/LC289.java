package Middle;

import java.util.Arrays;

public class LC289 {
    public static void main(String[] args) {
        new Solution().gameOfLife(new int[][]{{0,1,0},{0,0,1},{1,1,1},{0,0,0}});
    }
    /*
    289. 生命游戏
     */
    static class Solution {
        public void gameOfLife(int[][] board) {
            int h=board.length;
            int w=board[0].length;
            // 创建复制数组 copyBoard
            int[][] temp = new int[h][w];

            // 从原数组复制一份到 copyBoard 中
            for (int row = 0; row < h; row++) {
                for (int col = 0; col < w; col++) {
                    temp[row][col] = board[row][col];
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int count=0;
                    for (int k = -1; k < 2; k++) {
                        for (int l = -1; l < 2; l++) {
                            if (k==0 && l==0) continue;
                            if (i+k>-1 && i+k<h && j+l>-1 && j+l<w) {
                                if (temp[i+k][j+l]==1) count++;
                            }
                        }
                    }
//                    System.out.print(i+","+j+":"+count+"\t");
                    if ((temp[i][j] == 1) && count < 2 || count > 3) board[i][j]=0;
                    else if (temp[i][j] == 0 && count == 3) board[i][j]=1;
                }
//                System.out.println();
            }
        }
    }
}
