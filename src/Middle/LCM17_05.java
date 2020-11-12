package Middle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LCM17_05 {
    /*
    面试题 17.05.  字母与数字
     */
    class Solution {
        public String[] findLongestSubarray(String[] array) {
            int len=array.length;
            int[] num=new int[len];
            Map<Integer,Integer> memo=new HashMap<Integer,Integer>();
            int start=0,end=0,count=0;
            int dat=0;
            for (int i = 0; i < len; i++) {
                if (isNum(array[i])) {
                    dat++;
                }else {
                    dat--;
                }
               if (!memo.containsKey(dat)) {
                   memo.put(dat,i);
               }else {
                   if (i-memo.get(dat) > count ) {
                       start=memo.get(dat);
                       end=i;
                   }
               }
            }
            return Arrays.copyOfRange(array, start, end);
        }

        public boolean isNum(String s) {
            for (char c : s.toCharArray())
                if (c < '0' || c > '9') {
                    return false;
                }
            return true;
        }
    }
}
