package Easy;

import Extension.TreeNode;

public class LC110 {
    /*
    110. 平衡二叉树
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root==null) return true;
            return Math.abs(height(root.left)-height(root.right)) < 2 &&
                    isBalanced(root.left) && isBalanced(root.right);

        }

        public int height(TreeNode root) {
            if (root==null)
                return -1;
            else
                return 1+Math.max(height(root.left),height(root.right));
        }
    }

//    class Solution {
//        public boolean isBalanced(TreeNode root) {
//            return recur(root) != -1;
//        }
//
//        private int recur(TreeNode root) {
//            if (root == null) return 0;
//            int left = recur(root.left);
//            if(left == -1) return -1;
//            int right = recur(root.right);
//            if(right == -1) return -1;
//            return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
//        }
//    }
}
