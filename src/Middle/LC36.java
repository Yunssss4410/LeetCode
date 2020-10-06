package Middle;

import java.util.Arrays;

public class LC36 {
    /*
    36. 有效的数独
     */
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            int[][] b1 = new int[9][9];
            int[][] b2 = new int[9][9];
            int[][] b3 = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') continue;
                    int num = board[i][j] - '1';
                    int group = i / 3 * 3 + j / 3;
                    if (b1[i][num] == 1 || b2[j][num] == 1 || b3[group][num] == 1)
                        return false;
                    b1[i][num]++;
                    b2[j][num]++;
                    b3[group][num]++;
                }
            }
            return true;
        }
    }
}
