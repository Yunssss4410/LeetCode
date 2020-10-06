package Middle;

public class LC529 {
    /*
    529. 扫雷游戏
     */
    class Solution {
        public char[][] updateBoard(char[][] board, int[] click) {
            int x = click[0], y = click[1];
            if (board[x][y] == 'M') board[x][y] = 'X';
            else dfs(board, x, y);
            return board;
        }

        public void dfs(char[][] board, int x, int y) {
            int cnt = 0;
            //先看看周围有没有雷
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    int tx = x + i;
                    int ty = y + j;
                    if (i == 0 && j == 0 || tx < 0 || ty < 0 || tx >= board.length || ty >= board[0].length) continue;
                    if (board[tx][ty] == 'M') cnt++;
                }
            }

            //如果附近有雷，那么改变当前数字即可结束
            if (cnt > 0) {
                board[x][y] = (char) (cnt + '0');
            } else {
                board[x][y] = 'B';
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        int tx = x + i;
                        int ty = y + j;
                        if (i == 0 && j == 0 || tx < 0 || ty < 0 || tx >= board.length || ty >= board[0].length || board[tx][ty] != 'E') continue;
                        dfs(board, tx, ty);
                    }
                }
            }
        }
    }
}
