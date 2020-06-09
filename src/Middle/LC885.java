package Middle;

public class LC885 {
    public static void main(String[] args) {
        new Solution().spiralMatrixIII(1,4,0,0);
    }
    /*
    885. 螺旋矩阵 III
     */
    static class Solution {
        public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
            int[][] ints=new int[R*C][2];
            if (R<1 || C<1) return ints;
            ints[0]=new int[]{r0,c0};
            int curlen=1;
            int index=1;
            while (index < R * C)
            {
                //向右和向下
                for (int i = 0; i < curlen; i++) {
                    c0++;
                    if (r0 >= 0 && c0 >= 0 && r0 < R && c0 < C) {
                        ints[index++] = new int[]{r0, c0};
                    }
                }
                for (int i = 0; i < curlen; i++) {
                    r0++;
                    if (r0 >= 0 && c0 >= 0 && r0 < R && c0 < C) {
                        ints[index++] = new int[]{r0, c0};
                    }
                }
                curlen++;
                //向左和向上
                for (int i = 0; i < curlen; i++) {
                    c0--;
                    if (r0 >= 0 && c0 >= 0 && r0 < R && c0 < C) {
                        ints[index++] = new int[]{r0, c0};
                    }
                }
                for (int i = 0; i < curlen; i++) {
                    r0--;
                    if (r0 >= 0 && c0 >= 0 && r0 < R && c0 < C) {
                        ints[index++] = new int[]{r0, c0};
                    }
                }
                curlen++;
            }
            return ints;
        }
    }
}
