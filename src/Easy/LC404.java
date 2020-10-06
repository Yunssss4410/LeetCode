package Easy;

import Extension.TreeNode;

public class LC404 {
    /*
    404. 左叶子之和
     */
    class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) return 0;
            if (root.left!=null && root.left.left == null && root.left.right==null) return root.left.val;
            int left=sumOfLeftLeaves(root.left);
            int right=sumOfLeftLeaves(root.right);
            return left+right;
        }
    }
}
