package Middle;

import Extension.TreeNode;

import java.util.*;

public class LC103 {
    /*
    103. 二叉树的锯齿形层次遍历
     */
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root==null) return res;
            Deque<TreeNode> queue1 = new LinkedList<>();
            Deque<TreeNode> queue2 = new LinkedList<>();
            queue1.offer(root);
            boolean fl = false;
            while (!queue1.isEmpty()) {
                int size = queue1.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue1.poll();
                    list.add(node.val);
                    if (fl) {
                        if (node.right!=null)
                        queue2.addFirst(node.right);
                        if (node.left!=null)
                        queue2.addFirst(node.left);
                    }else {
                        if (node.left!=null)
                        queue2.addFirst(node.left);
                        if (node.right!=null)
                        queue2.addFirst(node.right);
                    }
                }
                queue1=queue2;
                queue2=new LinkedList<>();
                res.add(list);
                fl = !fl;
            }
            return res;
        }
    }
}
