package Middle;

import java.util.LinkedList;
import java.util.List;

public class LC60 {
    /*
    60. 第k个排列
     */
    class Solution {
        public String getPermutation(int n, int k) {
            char[] chars=new char[n];
            double[] JC=new double[n+1];
            JC[0]=1;
            List<Integer> list=new LinkedList<>();
            list.add(0);
            for (int i = 1; i <= n; i++) {
                JC[i] = JC[i-1]*i;
                list.add(i);
            }
            for (int i = 1; i <= n; i++) {
                int idx= (int) Math.ceil(k/JC[n-i]);
                chars[i-1]= (char) (list.remove(idx)+'0');
                k -= (idx-1)*JC[n-i];
            }
            return String.valueOf(chars);
        }
    }
}
