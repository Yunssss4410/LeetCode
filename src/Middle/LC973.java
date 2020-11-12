package Middle;

import java.util.Arrays;
import java.util.Comparator;

public class LC973 {
    /*
    973. 最接近原点的 K 个点
     */
    class Solution {
        public int[][] kClosest(int[][] points, int K) {
            Arrays.sort(points, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return sqrt(o1)-sqrt(o2);
                }
            });
            int[][] res=new int[K][2];
            for (int i = 0; i < K; i++) {
                res[i] = points[i];
            }
            return res;
        }

        public int sqrt(int[] o) {
            return o[0] * o[0] + o[1] * o[1];
        }
    }
}
