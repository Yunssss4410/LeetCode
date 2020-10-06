package Middle;

import java.util.*;

public class LC39 {
    /*
    39. 组合总和
     */
    class Solution {
        List<List<Integer>> lists=new ArrayList<>();
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            dfs(candidates,candidates.length,target,0,new ArrayDeque<>());
            return lists;
        }

        /**
         * @param candidates 数组输入
         * @param len        输入数组的长度，冗余变量
         * @param residue    剩余数值
         * @param begin      本轮搜索的起点下标
         * @param path       从根结点到任意结点的路径
         */
        private void dfs(int[] candidates,int len, int residue, int begin, Deque<Integer> path) {
            if (residue == 0) {
                lists.add(new ArrayList<>(path));
                return;
            }
            for (int i = begin; i < len; i++) {
                if (residue - candidates[i] <0) break;
                path.addLast(candidates[i]);
                dfs(candidates,len,residue-candidates[i],i,path);
                path.removeLast();
            }
        }
    }
}
