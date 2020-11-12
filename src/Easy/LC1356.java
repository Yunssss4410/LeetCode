package Easy;

import java.lang.reflect.Array;
import java.util.*;

public class LC1356 {
    /*
    1356. 根据数字二进制下 1 的数目排序
     */
    class Solution {
        public int[] sortByBits(int[] arr) {
            int[] ans = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                //Integer.bitCount(arr[i])转化为二进制一的数量
                ans[i] = Integer.bitCount(arr[i]) * 10000000 + arr[i];
            }
            Arrays.sort(ans);
            for (int i = 0; i < ans.length; i++) {
                ans[i] = ans[i] % 10000000;
            }
            return ans;
        }
    }
}
