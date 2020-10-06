package Easy;

import Extension.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LC104 {
    /*
    104. 二叉树的最大深度
     */
    class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) return 0;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            int ceng=0;
            while (!queue.isEmpty())
            {
                ceng++;
                int len=queue.size();
                for (int i = 0; i < len; i++) {
                    TreeNode node=queue.poll();
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            return ceng;
        }
    }
}
