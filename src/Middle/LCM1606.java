package Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class LCM1606 {
    /*
    面试题 16.06. 最小差
     */
    class Solution {
        public int smallestDifference(int[] a, int[] b) {
            if(a[0] == Integer.MIN_VALUE) return 1;
            Arrays.sort(a);
            Arrays.sort(b);
            long min=Integer.MAX_VALUE;
            int i=0,j=0;
            while (i < a.length && j < b.length)
            {
                if (a[i] == b[j]) return 0;
                else if (a[i] < b[j]) {
                    min=Math.min(min,Math.abs(a[i]-b[j]));
                    i++;
                }else {
                    min=Math.min(min,Math.abs(a[i]-b[j]));
                    j++;
                }
            }
            return (int) min;
        }
    }
}
