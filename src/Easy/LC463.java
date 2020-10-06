package Easy;

public class LC463 {
    /*
    463. 岛屿的周长
     */
    class Solution {
        public int islandPerimeter(int[][] grid) {
            int h = grid.length;
            int w = grid[0].length;
            int res = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] != 1) continue;
                    int len = 4;
                    if (i > 0 && grid[i - 1][j] == 1) len--;
                    if (i < h - 1 && grid[i + 1][j] == 1) len--;
                    if (j > 0 && grid[i][j - 1] == 1) len--;
                    if (j < w - 1 && grid[i][j + 1] == 1) len--;
                    res+=len;
                }
            }
            return res;
        }
    }
}
