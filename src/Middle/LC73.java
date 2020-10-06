package Middle;

import com.sun.org.apache.regexp.internal.RE;

public class LC73 {
    /*
    73. 矩阵置零
     */
    class Solution {
        public void setZeroes(int[][] matrix) {
            int R = matrix.length;
            int C = matrix[0].length;
            int MO= -10000;
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (matrix[i][j] == 0) {
                        //当列为1的数变为-1
                        for (int k = 0; k < R; k++) {
                            if (matrix[k][j] != 0)
                                matrix[k][j] = MO;
                        }
                        //当行为1的数变为-1
                        for (int k = 0; k < C; k++) {
                            if (matrix[i][k] != 0)
                                matrix[i][k] = MO;
                        }
                    }
                }
            }
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (matrix[i][j] == MO)
                        matrix[i][j] = 0;
                }
            }
        }
    }
}
