package Easy;

import Extension.TreeNode;

public class LC235 {
    /*
    235. 二叉搜索树的最近公共祖先
     */
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root==null || root.val==p.val || root.val==q.val) return root;
            TreeNode left=lowestCommonAncestor(root.left,p,q);
            TreeNode right=lowestCommonAncestor(root.right,p,q);
            if (left == null) return right;
            if (right == null) return left;
            return root;
        }
    }
}
