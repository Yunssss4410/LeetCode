package Middle;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LC77 {
    /*
    77. 组合
     */
    class Solution {
        List<List<Integer>> lists=new ArrayList<>();
        boolean[] used;
        public List<List<Integer>> combine(int n, int k) {
            if (n < k) return lists;
            used=new boolean[n+1];
            dfs(n,k,0,1,new ArrayDeque<>());
            return lists;
        }

        /**
         * Create by: Yun
         * Description: TODO
         * Create time: 2020/9/8 9:25
         *
         * @param n
         * @param k
         * @param idx 即将选第几个数
         * @param start 从几开始
         * @param list
         * @return void
         */
        public void dfs(int n, int k,int idx,int start, Deque<Integer> list) {
            if (k == idx) {
                lists.add(new ArrayList<>(list));
                return;
            }

            for (int i = start; i <= n - (k - idx) + 1; i++) {
                if (used[i]) continue;
                else used[i]=true;
                list.addLast(i);
                dfs(n,k,idx+1,i+1,list);
                list.removeLast();
                used[i]=false;
            }
        }
    }
}
