package Easy;

import java.util.Arrays;

public class LC1252 {
    public static void main(String[] args) {
        int res=new Solution().oddCells(2,3,new int[][]{{0,1},{1,1}});
        System.out.println(res);
    }
    /*
    1252. 奇数值单元格的数目
     */
    static class Solution {
        public int oddCells(int n, int m, int[][] indices) {
            int[] bn=new int[n];
            int[] bm=new int[m];

            for (int[] ints : indices) {
                if (bn[ints[0]]==1) {
                    bn[ints[0]]=0;
                }else {
                    bn[ints[0]]=1;
                }
                if (bm[ints[1]]==1) {
                    bm[ints[1]]=0;
                }else {
                    bm[ints[1]]=1;
                }
            }

            int lie=0;
            for (int i = 0; i < m; i++) {
                if (bm[i]==1) {
                    lie++;
                }
            }

            int res=0;
            for (int i = 0; i < n; i++) {
                if (bn[i]==0) {
                    res+=lie;
                }else {
                    res+=m-lie;
                }
            }
            return res;
        }
    }
}
