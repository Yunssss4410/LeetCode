package Middle;

import java.util.Arrays;
import java.util.Comparator;

public class LC1024 {
    /*
    1024. 视频拼接
     */
    class Solution {
        public int videoStitching(int[][] clips, int T) {
            int[] maxEnd = new int[T + 1];
            Arrays.fill(maxEnd, -1);
            boolean hasT = false;
            for (int[] clip : clips) {
                if (clip[0] >= T) continue;
                maxEnd[clip[0]] = Math.min(T,Math.max(maxEnd[clip[0]], clip[1]));
                if (clip[1] >= T) hasT = true;
            }
            if (!hasT || maxEnd[0] == -1) return -1;
            int res = 1;
            int left = 0;
            int right = maxEnd[0];
            int max =0;
            if (right == T) return res;
            while (left <= right) {
                if (maxEnd[left] > max) max = maxEnd[left];
                if (left == right) {
                    right=max;
                    res++;
                    if(right >= T) return res;
                }
                left++;
            }
            return -1;
        }
    }
}
