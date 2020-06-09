package Easy;

public class LC17_01 {
    public static void main(String[] args) {
        new Solution().add(111,899);
    }
    /*
    面试题 17.01. 不用加号的加法
    URL：https://leetcode-cn.com/problems/add-without-plus-lcci/
     */
    static class Solution {
        public int add(int a, int b) {
            while (b!=0)
            {
                int ta=a,tb=b;
                a=ta^tb;
                b=ta&tb;
                b<<=1;
                System.out.println(a);
            }
            return a;
        }
    }
}
