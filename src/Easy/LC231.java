package Easy;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;

public class LC231 {
    public static void main(String[] args) {
        int num=2;
        for (int i = 0; i <= 30; i++) {
            System.out.println("case "+(int)Math.pow(num,i)+":");
        }
    }
    /*
    231. 2的幂
     */
    class Solution {
        public boolean isPowerOfTwo(int n) {
            //其实这道题就是 2的n次方，那就是一直×2，也就是不停左移就行了
            //
            switch (n) {
                case 1:
                case 2:
                case 4:
                case 8:
                case 16:
                case 32:
                case 64:
                case 128:
                case 256:
                case 512:
                case 1024:
                case 2048:
                case 4096:
                case 8192:
                case 16384:
                case 32768:
                case 65536:
                case 131072:
                case 262144:
                case 524288:
                case 1048576:
                case 2097152:
                case 4194304:
                case 8388608:
                case 16777216:
                case 33554432:
                case 67108864:
                case 134217728:
                case 268435456:
                case 536870912:
                case 1073741824:
                case 2147483647:return true;
            }
            return false;
        }
    }
}
