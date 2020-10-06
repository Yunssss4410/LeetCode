package Easy;

import java.util.Arrays;

public class LC475 {
    /*
    475. 供暖器
     */
    class Solution {
        public int findRadius(int[] houses, int[] heaters) {
            Arrays.sort(houses);
            Arrays.sort(heaters);
            int res = 0;
            for (int house : houses) {
                int index = Arrays.binarySearch(heaters, house);
                if (index > -1) continue;
                index = -index - 1;
                int left = index > 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;
                int right = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;
                res = Math.max(res, Math.min(left, right));
            }
            return res;
        }
    }
}
