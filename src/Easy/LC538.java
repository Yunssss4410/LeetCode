package Easy;

import Extension.TreeNode;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class LC538 {
    /*
    538. 把二叉搜索树转换为累加树
     */
    class Solution {
        int sum=0;
        public TreeNode convertBST(TreeNode root) {
            if (root != null) {
                convertBST(root.right);
                sum+=root.val;
                root.val=sum;
                convertBST(root.left);
            }
            return root;
        }
    }
}
