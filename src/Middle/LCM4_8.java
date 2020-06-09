package Middle;

import Extension.TreeNode;

public class LCM4_8 {
    /*
    面试题 04.08. 首个共同祖先
     */
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root==null || root==p || root==q) return root;
            TreeNode left=lowestCommonAncestor(root.left,p,q);
            TreeNode right=lowestCommonAncestor(root.right,p,q);
            if (left != null) {
                if (right != null)
                    return root;
                else
                    return left;
            }else
                return right;
        }
    }
}
