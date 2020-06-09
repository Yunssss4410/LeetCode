package Middle;

public class LC1423 {
    /*
    1423. 可获得的最大点数
     */
    class Solution {
        public int maxScore(int[] cardPoints, int k) {
            int[] left=new int[k+1];
            int[] right=new int[k+1];
            for (int i = 1; i <= k; i++) {
                left[i]=left[i-1]+cardPoints[i-1];
                right[i]=right[i-1]+cardPoints[cardPoints.length-i];
            }

            int res=Math.max(left[k],right[k]);
            for (int i = 1; i <= k; i++) {
                if (left[i]+right[k-i] > res) {
                    res=left[i]+right[k-i];
                }
            }
            return res;
        }
    }
}
