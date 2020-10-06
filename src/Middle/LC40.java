package Middle;

import java.util.*;

public class LC40 {
    /*
    40. 组合总和 II
     */
    class Solution {
        List<List<Integer>> lists=new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            dfs(candidates,candidates.length,target,0,new ArrayDeque<>());
            return lists;
        }

        private void dfs(int[] candidates,int len, int residue, int begin, Deque<Integer> path) {
            if (residue == 0) {
                lists.add(new ArrayList<>(path));
                return;
            }

            for (int i = begin; i < len; i++) {
                if (candidates[i] > residue) break;
                if (i > 0 && candidates[i]==candidates[i-1] && i!=begin) continue;
                path.addLast(candidates[i]);
                dfs(candidates,len,residue-candidates[i],i+1,path);
                path.removeLast();
            }
        }
    }
}
