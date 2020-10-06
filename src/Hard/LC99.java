package Hard;

import Extension.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC99 {
    /*
    99. 恢复二叉搜索树
     */
    class Solution {
        public void recoverTree(TreeNode root) {
            Deque<TreeNode> stack = new ArrayDeque<>();
            TreeNode x = null, y = null, pre = null;

            while (!stack.isEmpty() || root != null) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                if (pre != null && root.val < pre.val) {
                    y = root;
                    if (x == null)
                        x = pre;
                    else
                        break;
                }
                pre = root;
                root = root.right;
            }
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }
}
