package Easy;

import Extension.TreeNode;

public class LC108 {
    /*
    108. 将有序数组转换为二叉搜索树
     */
    class Solution {

        public int[] nums;

        public TreeNode sortedArrayToBST(int[] nums) {
            this.nums = nums;
            return helper(0, nums.length - 1);
        }

        /**
         * Create by: Yun
         * Description: TODO
         * Create time: 2020/8/7 9:29
         *
         * @param left 左起始点
         * @param right 右起始点
         * @return Extension.TreeNode
         */
        public TreeNode helper(int left, int right) {
            //当left > right 的时候，就是左指针大于右指针了
            if (left > right) return null;

            // 取给定限制范围的中间那个
            int p = (left + right) / 2;

            // 生成中间节点
            TreeNode root = new TreeNode(nums[p]);
            root.left = helper(left, p - 1);
            root.right = helper(p + 1, right);
            return root;
        }
    }
}
