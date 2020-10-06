package Easy;

import Extension.TreeNode;

public class LC111 {
    /*
    111. 二叉树的最小深度
     */
    class Solution {
        public int minDepth(TreeNode root) {
            if (root == null) return 0;
            if (root.left == null && root.right==null) return 1;
            int leftdepth=Integer.MAX_VALUE;
            if (root.left != null) {
                leftdepth=minDepth(root.left);
                if (leftdepth == 1) return 2;
            }
            int rightdepth=Integer.MAX_VALUE;
            if (root.right != null) {
                rightdepth = minDepth(root.right);
                if (rightdepth == 1) return 2;
            }
            return 1+Math.min(leftdepth,rightdepth);
        }
    }
}
