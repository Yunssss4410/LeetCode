package Middle;

import java.util.ArrayList;
import java.util.List;

public class LC89 {
    /*
    89. 格雷编码
     */
    class Solution {
        public List<Integer> grayCode(int n) {
            //格雷编码的生成过程, G(i) = i ^ (i/2);
            List<Integer> list=new ArrayList<>();
            for (int i = 0; i < 1 << n; i++) {
                list.add(i^(i/2));
            }
            return list;
        }
    }

    //另一种解法：https://leetcode-cn.com/problems/gray-code/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by--12/
    //其中的动态规划
}
