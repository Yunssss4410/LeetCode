package Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC51 {
    /*
    51. N 皇后
     */
    class Solution {

        int N;
        char[][] board;
        List<List<String>> res=new ArrayList<>();

        public List<List<String>> solveNQueens(int n) {
            N=n;
            board=new char[n][n];
            for (char[] chars : board) {
                Arrays.fill(chars,'.');
            }
            backtrack(0);
            return res;
        }

        //在第 r 行放置一个
        public void backtrack(int r) {
            //第N行时，就放够了
            if (r == N) {
                List<String> list=new ArrayList<>();
                for (char[] chars : board) {
                    list.add(new String(chars));
                }
                res.add(list);
                return;
            }

            //回溯放置
            for (int i = 0; i < N; i++) {
                if (!isValid(r,i)) continue;
                board[r][i] = 'Q';
                backtrack(r+1);
                board[r][i] = '.';
            }
        }

        //检查该位置是否能放置N皇后
        public boolean isValid(int x,int y) {
            //我们是从第一行往下放，所以不可能有下面某行已经存在的情况，不需要行检查

            //列检查
            for (int i = 0; i < x; i++) {
                if (board[i][y]=='Q') return false;
            }
            // 主对角线
            for (int i = x - 1, j = y - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') return false;
            }
            // 副对角线
            for (int i = x - 1, j = y + 1; i >= 0 && j < N; i--, j++) {
                if (board[i][j] == 'Q') return false;
            }
            return true;
        }
    }
}
