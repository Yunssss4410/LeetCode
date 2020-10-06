package Easy;

import Extension.TreeNode;

import java.util.ArrayList;

public class LC530 {
    /*
    530. 二叉搜索树的最小绝对差
     */
    class Solution {
        ArrayList<Integer> list;
        public int getMinimumDifference(TreeNode root) {
            list=new ArrayList<>();
            dfs(root);
            list.sort((o1, o2) -> o1-o2);
            int res=Integer.MAX_VALUE;
            for (int i = 1; i < list.size(); i++) {
                res=Math.min(res,Math.abs(list.get(i)-list.get(i-1)));
            }
            return res;
        }

        public void dfs(TreeNode root) {
            if (root==null) return;
            list.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
}
