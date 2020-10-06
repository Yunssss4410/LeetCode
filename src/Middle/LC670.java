package Middle;


import java.util.Arrays;

public class LC670 {
    public static void main(String[] args) {
        int num=new Solution().maximumSwap(98368);
        System.out.println(num);
    }
    /*
    670. 最大交换
     */
    static class Solution {
        public int maximumSwap(int num) {
            char[] chars=String.valueOf(num).toCharArray();
            int len=chars.length;
            int[] maxnum=new int[len];
            maxnum[len-1]=len-1;
            for (int i = len - 2; i >= 0; i--) {
                if (chars[i] > chars[maxnum[i+1]]) {
                    maxnum[i]=i;
                }else {
                    maxnum[i]=maxnum[i+1];
                }
            }
//            for (int i = 0; i < len; i++) {
//                System.out.print(maxnum[i]+",");
//            }
            for (int i = 0; i < len; i++) {
                if (maxnum[i] != i && chars[maxnum[i]] != chars[i]) {
                    char temp=chars[i];
                    chars[i]=chars[maxnum[i]];
                    chars[maxnum[i]]=temp;
                    break;
                }
            }
            return Integer.parseInt(String.valueOf(chars));
        }
    }
}
