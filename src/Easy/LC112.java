package Easy;

import Extension.TreeNode;

public class LC112 {
    /*
    112. 路径总和
     */
    class Solution {
        public boolean hasPathSum(TreeNode root, int sum) {
            return dfs(sum,0,root);
        }

        public boolean dfs(int sum,int cursum,TreeNode root) {
            if (root==null) {
                return false;
            }
            cursum+=root.val;
            if (cursum == sum && root.left==null && root.right==null) return true;

            return dfs(sum,cursum,root.left) || dfs(sum,cursum,root.right);
        }
    }
}
