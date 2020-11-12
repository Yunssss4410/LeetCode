package Middle;

import Extension.Node;

public class LC116 {
    /*
    116. 填充每个节点的下一个右侧节点指针
     */
    class Solution {
        public Node connect(Node root) {
            if (root == null || root.left == null)
                return root;
            root.left.next=root.right;
            if (root.next != null) {
                root.right.next=root.next.left;
            }
            connect(root.left);
            connect(root.right);
            return root;
        }
    }
}
