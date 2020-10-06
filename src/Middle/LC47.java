package Middle;

import java.util.*;

public class LC47 {
    /*
    47. 全排列 II
     */
    class Solution {
        List<List<Integer>> lists=new ArrayList<>();
        boolean[] used;
        public List<List<Integer>> permuteUnique(int[] nums) {
            used=new boolean[nums.length];
            Arrays.sort(nums);
            dfs(nums,nums.length,0,new StringBuilder(),new ArrayDeque<>());
            return lists;
        }

        public void dfs(int[] nums, int len, int start,StringBuilder path,ArrayDeque<Integer> list) {
            if (start == len) {
                lists.add(new ArrayList<>(list));
                return;
            }
            for (int i = 0; i < len; i++) {
                if (used[i] || (i>0 && nums[i-1]==nums[i] && !used[i-1])) continue;
                else used[i]=true;
                list.addLast(nums[i]);
                dfs(nums,len,start+1,path,list);
                list.removeLast();
                used[i]=false;
            }
        }
    }
}
