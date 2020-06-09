package Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC417 {
    /*
    417. 太平洋大西洋水流问题
     */
    class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] matrix) {
            List<List<Integer>> ans = new ArrayList<>();
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return ans;
            }
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] taipingyang=new int[m][n];
            int[][] daxiyang=new int[m][n];
            for (int i = 0; i < m; i++) {
                dfs(matrix,taipingyang,i,0,0);
                dfs(matrix,daxiyang,i,n-1,0);
            }
            for (int i = 0; i < n; i++) {
                dfs(matrix,taipingyang,0,i,0);
                dfs(matrix,daxiyang,m-1,i,0);
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (taipingyang[i][j]==1 && daxiyang[i][j]==1) {
                        ans.add(Arrays.asList(i, j));
                    }
                }
            }
            return ans;
        }

        public void dfs(int[][] matrix,int[][] aux,int m,int n,int pre)
        {
            if (m<0 || n<0 || m>matrix.length-1 || n>matrix[0].length-1 || aux[m][n]==1 || matrix[m][n] < pre){
                return;
            }

            aux[m][n]=1;
            dfs(matrix,aux,m-1,n,matrix[m][n]);
            dfs(matrix,aux,m+1,n,matrix[m][n]);
            dfs(matrix,aux,m,n-1,matrix[m][n]);
            dfs(matrix,aux,m,n+1,matrix[m][n]);
        }
    }
}
