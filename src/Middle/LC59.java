package Middle;

public class LC59 {
    /*
    59. 螺旋矩阵 II
     */
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] res=new int[n][n];
            int num=1;
            int left=0,top=0;
            int right=n-1,bottom=n-1;
            while (num <= n*n)
            {
                for (int i = left; i <= right; i++) res[top][i]=num++;
                top++;
                for (int i = top; i <= bottom; i++) res[i][right]=num++;
                right--;
                for (int i = right; i >= left ; i--) res[bottom][i]=num++;
                bottom--;
                for (int i = bottom; i >= top ; i--) res[i][left]=num++;
                left++;
            }
            return res;
        }
    }
}
