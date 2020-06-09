package Middle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC1238 {
    public static void main(String[] args) {
        List<Integer> list=new Solution().circularPermutation(3,2);
        System.out.println(list);
    }
    /*
    1238. 循环码排列
     */
    static class Solution {
        public List<Integer> circularPermutation(int n, int start) {
            List<Integer> list1=new ArrayList<>();
            List<Integer> list2=new ArrayList<>();
            int i;
            for (i=0; i < 1<<n; i++) {
                int num=i^(i/2);
                if (num==start) {
                    break;
                }
                list1.add(num);
            }
            for (int j=i; j < 1<<n; j++) {
                list2.add(j^(j/2));
            }
            list2.addAll(list1);
            return list2;
        }
    }
}
