package Middle;

public class LC74 {
    /*
    74. 搜索二维矩阵
     */
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int[] ints : matrix) {
                int right = ints.length - 1;
                if (right < 0 || ints[0] > target) break;
                if (ints[right] < target) continue;
                int left = 0;
                while (left < right) {
                    int mid = left + (right - left) / 2;
                    if (ints[mid] == target) return true;
                    if (target < ints[mid]) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                if (ints[left] == target) return true;
            }
            return false;
        }
    }
}
