package Easy;

public class LC492 {
    /*
    492. 构造矩形
     */
    class Solution {
        public int[] constructRectangle(int area) {
            for (int i = (int) Math.sqrt(area); i < area; i++) {
                if (area % i == 0) return new int[]{i, area / i};
            }
            return new int[]{area, 1};
        }
    }
}
