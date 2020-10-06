package Hard;

import Extension.TreeNode;

public class LC124 {
    /*
    124. 二叉树中的最大路径和
     */
    class Solution {
        int maxway = Integer.MIN_VALUE;

        public int maxPathSum(TreeNode root) {
            maxGain(root);
            return maxway;
        }

        //只返回一条路径的长
        public int maxGain(TreeNode root) {
            if (root == null) return 0;

            int leftGain = Math.max(maxGain(root.left), 0);
            int rightGain = Math.max(maxGain(root.right), 0);

            int curway = leftGain + rightGain + root.val;

            maxway = Math.max(maxway, curway);

            return root.val + Math.max(leftGain, rightGain);
        }

    }
}
