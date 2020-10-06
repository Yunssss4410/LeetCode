package Middle;

import Extension.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC94 {
    /*
    94. 二叉树的中序遍历
     */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> list=new ArrayList<>();
            dfs(root,list);
            return list;
        }

        public void dfs(TreeNode root,List<Integer> list) {
            if (root == null) return;
            if (root.left != null)
                dfs(root.left,list);
            list.add(root.val);
            if (root.right != null)
                dfs(root.right,list);
        }
    }
}
