package Easy;

import Extension.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC257 {
    /*
    257. 二叉树的所有路径
     */
    class Solution {
        List<String> list = new ArrayList<>();

        public List<String> binaryTreePaths(TreeNode root) {
            if (root == null) return list;
            dfs(root, new StringBuilder());
            return list;
        }

        public void dfs(TreeNode root, StringBuilder s) {
            s.append(root.val);
            if (root.left == null && root.right == null ) {
                list.add(s.toString());
                return;
            }
            s.append("->");
            int len=s.length();
            if (root.left != null) dfs(root.left, s);
            s.delete(len,s.length());
            if (root.right != null) dfs(root.right, s);
        }
    }
}
