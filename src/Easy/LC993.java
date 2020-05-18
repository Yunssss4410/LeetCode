package Easy;

import Extension.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class LC993 {
    /*
    993. 二叉树的堂兄弟节点
    URL:https://leetcode-cn.com/problems/cousins-in-binary-tree/
     */

    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            if (root.val==x || root.val==y) return false;
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty())
            {
                TreeNode ft=null;
                int len=queue.size();
                for (int i = 0; i < len; i++)
                {
                    TreeNode treeNode=queue.poll();
                    if (treeNode.left!=null) {
                        if (treeNode.left.val==x || treeNode.left.val==y) {
                            if (ft==null) {
                                ft=treeNode;
                            }else {
                                if (ft.val!=treeNode.val) return true;
                                else return false;
                            }
                        }
                        queue.offer(treeNode.left);
                    }
                    if (treeNode.right!=null) {
                        if (treeNode.right.val==x || treeNode.right.val==y) {
                            if (ft==null) {
                                ft=treeNode;
                            }else {
                                if (ft.val!=treeNode.val) return true;
                                else return false;
                            }
                        }
                        queue.offer(treeNode.right);
                    }
                }
                if (ft!=null) return false;
            }
            return false;
        }
    }
}
