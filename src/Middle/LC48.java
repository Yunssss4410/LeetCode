package Middle;

public class LC48 {
    /*
    48. 旋转图像
     */
    class Solution {
        public void rotate(int[][] matrix) {
            //沿着对角线翻转，再垂直翻转
           int len=matrix.length;
            for (int i = 0; i < len; i++) {
                for (int j = i+1; j < len; j++) {
                    swap(matrix,new int[]{i,j},new int[]{j,i});
                }
            }

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len/2; j++) {
                    swap(matrix,new int[]{i,j},new int[]{i,len-j-1});
                }
            }
        }

        public void swap(int[][] matrix,int[] i,int[] j) {
            int temp=matrix[i[0]][i[1]];
            matrix[i[0]][i[1]]=matrix[j[0]][j[1]];
            matrix[j[0]][j[1]]=temp;
        }
    }
}
