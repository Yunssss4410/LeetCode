package Easy;

import Extension.TreeNode;

public class LC101 {
    /*
    101. 对称二叉树
     */
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return check(root,root);
        }

        public boolean check(TreeNode left,TreeNode right) {
            if (left==null && right==null)
                return true;
            if (left==null || right==null)
                return false;
            return left.val==right.val && check(left.left,right.right) && check(right.left,left.right);
        }
    }
}
