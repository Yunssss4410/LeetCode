package Middle;

import Extension.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LC95 {
    /*
    95. 不同的二叉搜索树 II
     */
    class Solution {
        public List<TreeNode> generateTrees(int n) {
            List<TreeNode> pre = new ArrayList<>();
            if (n == 0) return pre;
            pre.add(null);
            //每增加一个数字，循环一次
            for (int i = 1; i < n + 1; i++) {
                List<TreeNode> cur = new ArrayList<>();
                //遍历之前的所有解
                for (TreeNode node : pre) {
                    //第一个接，插入到根节点
                    TreeNode insert = new TreeNode(i);
                    insert.left = node;
                    cur.add(insert);
                    //之后的解都是往右边插
                    for (int j = 0; j < n + 1; j++) {
                        TreeNode root_copy = treeCopy(node); //复制当前的树
                        TreeNode right = root_copy; //找到要插入右孩子的位置
                        int k = 0;
                        for (; k < j; k++) {
                            if (right == null) break;
                            right = right.right;
                        }
                        //到达 null 提前结束
                        if (right == null) break;
                        TreeNode rightTree = right.right;
                        insert = new TreeNode(i);
                        right.right = insert;
                        insert.left = rightTree;
                        cur.add(root_copy);
                    }
                }
                pre = cur;
            }
            return pre;
        }

        //树复制
        private TreeNode treeCopy(TreeNode root) {
            if (root == null) {
                return root;
            }
            TreeNode newRoot = new TreeNode(root.val);
            newRoot.left = treeCopy(root.left);
            newRoot.right = treeCopy(root.right);
            return newRoot;
        }

    }
}
