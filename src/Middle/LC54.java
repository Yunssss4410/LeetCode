package Middle;

import java.util.ArrayList;
import java.util.List;

public class LC54 {
    /*
    54. 螺旋矩阵
     */
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list=new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return list;
            }
            int left=0,top=0,bottom=matrix.length-1,right=matrix[0].length-1;
            while (left <= right && top<=bottom)
            {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }

                for (int i = top+1; i < bottom + 1; i++) {
                    list.add(matrix[i][right]);
                }
                if (left < right && top < bottom) {
                    for (int i = right - 1; i >= left; i--) {
                        list.add(matrix[bottom][i]);
                    }

                    for (int i = bottom-1; i > top; i--) {
                        list.add(matrix[i][left]);
                    }
                }
                left++;top++;right--;bottom--;
            }
            return list;
        }
    }
}
