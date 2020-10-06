package Middle;

public class LC130 {
    /*
    130. 被围绕的区域
     */
    class Solution {
        int r, l;

        public void solve(char[][] board) {
            if (board == null || board.length == 0 || board[0].length == 0) return;
            r = board.length;
            l = board[0].length;
            for (int i = 0; i < r; i++) {
                dfs(board, i, 0);
                dfs(board, i, l - 1);
            }
            for (int i = 0; i < l; i++) {
                dfs(board, 0, i);
                dfs(board, r - 1, i);
            }

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < l; j++) {
                    if (board[i][j] == '-') board[i][j] = 'O';
                    else if (board[i][j] == 'O') board[i][j] = 'X';
                }
            }
        }

        public void dfs(char[][] board, int i, int j) {
            if (i < 0 || i >= r || j < 0 || j >= l || board[i][j] != 'O') return;
            board[i][j] = '-';
            dfs(board, i + 1, j);
            dfs(board, i - 1, j);
            dfs(board, i, j + 1);
            dfs(board, i, j - 1);
        }
    }
}
