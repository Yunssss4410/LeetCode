package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC119 {
    /*
    119. 杨辉三角 II
     */
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> list=new ArrayList<>();
            long cur = 1;
            for (int i = 0; i <= rowIndex; i++) {
                list.add((int) cur);
                    cur = cur * (rowIndex-i)/(i+1);
            }
            return list;
        }
    }

    class Solution_v2 {
        public List<Integer> getRow(int rowIndex) {
            rowIndex++;
            Integer[] dp=new Integer[rowIndex];
            Arrays.fill(dp,1);
            for (int i = 3; i <= rowIndex; i++) {
                for (int j = i-2; j > 0 ; j--) {
                    dp[j]=dp[j]+dp[j-1];
                }
            }
            return Arrays.asList(dp);
        }
    }
}
