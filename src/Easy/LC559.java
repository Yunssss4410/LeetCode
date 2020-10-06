package Easy;

import Extension.Node;

public class LC559 {
    /*
    559. N叉树的最大深度
     */
    class Solution {
        public int maxDepth(Node root) {
            if (root == null || root.children.isEmpty()) return 0;
            int max=0;
            for (Node child : root.children) {
                max=Math.max(max,maxDepth(child));
            }
            return max+1;
        }
    }
}
