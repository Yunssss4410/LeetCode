package Easy;

import Extension.TreeNode;

public class LC437 {
    /*
    437. 路径总和 III
     */
    class Solution {
        public int pathSum(TreeNode root, int sum) {
            return dfs(root, sum, new int[1000], 0);
        }

        public int dfs(TreeNode root, int sum, int[] array/*保存路径*/, int p/*指向路径长度*/) {
            if (root == null) {
                return 0;
            }
            int tmp = root.val;
            int n = root.val == sum ? 1 : 0;
            for (int i = p - 1; i >= 0; i--) {
                tmp += array[i];
                if (tmp == sum) {
                    n++;
                }
            }
            array[p] = root.val;
            int n1 = dfs(root.left, sum, array, p + 1);
            int n2 = dfs(root.right, sum, array, p + 1);
            return n + n1 + n2;
        }
    }
}
