package Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class LC1337 {
    /*
    1337. 方阵中战斗力最弱的 K 行
     */
    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int[][] temp=new int[mat.length][2];
            for (int i = 0; i < mat.length; i++) {
                temp[i][0]=i;
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == 1) temp[i][1]++;
                    else break;
                }
            }
            Arrays.sort(temp, (o1, o2) -> o1[1]-o2[1]);
            int[] res=new int[k];
            for (int i = 0; i < k; i++) {
                res[i]=temp[i][0];
            }
            return res;
        }
    }
}
