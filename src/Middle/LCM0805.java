package Middle;

import com.sun.org.apache.regexp.internal.RE;

public class LCM0805 {
    /*
    面试题 08.05. 递归乘法
     */
    class Solution {
        public int multiply(int A, int B) {
            if (B==0) return A;
            return A+multiply(A,B-1);
        }
    }
}
