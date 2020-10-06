package Easy;

import Extension.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC107 {
    /*
    107. 二叉树的层次遍历 II
     */
    class Solution {
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            LinkedList<List<Integer>> lists=new LinkedList<>();
            if (root == null) return lists;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty())
            {
                int len=queue.size();
                List<Integer> list=new ArrayList<>();
                for (int i = 0; i < len; i++) {
                    TreeNode node=queue.poll();
                    list.add(node.val);
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
                lists.addFirst(list);
            }
            return lists;
        }
    }
}
