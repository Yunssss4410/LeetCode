package Easy;

import Extension.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LC226 {
    /*
    226. 翻转二叉树
     */
    class Solution {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) return root;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty())
            {
                int size=queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null)queue.add(node.right);
                    TreeNode temp=node.left;
                    node.left=node.right;
                    node.right=temp;
                }
            }
            return root;
        }
    }
}
