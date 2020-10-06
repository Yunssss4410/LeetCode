package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LC447 {
    /*
    447. 回旋镖的数量
     */
    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            Map<Integer, Integer> map = new HashMap<>();
            int res = 0;
            for (int i = 0; i < points.length-1; i++) {
                map.clear();
                for (int j = i+1; j < points.length; j++) {
                    int len = (points[i][0] - points[j][0]) * (points[i][0] - points[j][0]) + (points[i][1] - points[j][1]) * (points[i][1] - points[j][1]);
                    res += map.getOrDefault(len, 0) * 2;
                    map.put(len, map.getOrDefault(len, 0) + 1);
                }
            }
            return res;
        }
    }
}
