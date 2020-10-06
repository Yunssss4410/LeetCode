package Middle;

public class LC79 {
     /*
    79. 单词搜索
     */
     class Solution {

         char[][] board;
         boolean flag;
         public boolean exist(char[][] board, String word) {
            this.board=board;
             if(board == null || board.length == 0 || board[0].length == 0 ) {
                 return false;
             }

             for (int i = 0; i < board.length; i++) {
                 for (int j = 0; j < board[i].length; j++) {
                     if (dfs(i,j,word,0)) return true;
                 }
             }
            return false;
         }

         public boolean dfs(int i,int j,String word,int next) {
             if (next == word.length()) {
                 flag = true;
                 return true;
             }

             //当超出边界 或 不是目标值的时候将会false
             if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(next))
                return false;

             if (flag) return true;

             char c = board[i][j];
             board[i][j] = '.';
             boolean ret1 = dfs(i + 1, j, word, next + 1);
             boolean ret2 = dfs(i - 1, j, word, next + 1);
             boolean ret3 = dfs(i, j + 1, word, next + 1);
             boolean ret4 = dfs(i, j - 1, word, next + 1);
             board[i][j] = c;
             return ret1 || ret2 || ret3 || ret4;
         }
     }
}
