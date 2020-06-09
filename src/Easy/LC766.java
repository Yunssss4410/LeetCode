package Easy;

public class LC766 {
    /*
    766. 托普利茨矩阵
     */
    class Solution {
        public boolean isToeplitzMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                if (!isok(matrix,i,0)) return false;
            }
            for (int i = 0; i < matrix[0].length; i++) {
                if (!isok(matrix,0,i)) return false;
            }
            return true;
        }

        public boolean isok(int[][] matrix,int i,int j)
        {
            int lie=matrix.length;
            int hang=matrix[0].length;
            int num=matrix[i][j];
            while (i < lie && j < hang)
            {
                if (matrix[i++][j++]!=num) return false;
            }
            return true;
        }
    }

    class Solution_v2 {
        public boolean isToeplitzMatrix(int[][] matrix) {
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[0].length; j++) {
                    if (matrix[i][j] != matrix[i-1][j-1]) return false;
                }
            }
            return true;
        }
    }
}
