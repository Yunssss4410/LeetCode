package Easy;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LC977 {

    /*
    977. 有序数组的平方
     */
    class Solution {
        public int[] sortedSquares(int[] A) {
            int left = 0;
            int right = A.length - 1;
            int[] res = new int[A.length];
            int index=A.length-1;
            while (left != right) {
                int lnum = Math.abs(A[left]);
                int rnum = A[right];
                if (lnum > rnum) {
                    res[index--]=lnum*lnum;
                    left++;
                }else {
                    res[index--]=rnum*rnum;
                    right--;
                }
            }
            res[index]=Math.abs(A[left]) * Math.abs(A[left]);
            return res;
        }
    }
}
