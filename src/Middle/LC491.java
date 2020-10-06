package Middle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC491 {
    /*
    491. 递增子序列
     */
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();

        public List<List<Integer>> findSubsequences(int[] nums) {
            dfs(nums, -1, new ArrayList<>());
            return ans;
        }

        private void dfs(int[] nums, int idx, List<Integer> curList) {
            if (curList.size() >=2)
                ans.add(new ArrayList<>(curList));

            Set<Integer> set = new HashSet<>();
            for (int i = idx + 1; i < nums.length; i++) {
                if (set.contains(nums[i])) continue;
                set.add(nums[i]);
                if (idx == -1 || nums[i] >= nums[idx]) {
                    curList.add(nums[i]);
                    dfs(nums, i, curList);
                    curList.remove(curList.size() - 1);
                }
            }
        }

    }
}
