package Hard;

import Extension.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LC1028 {
    /*
    1028. 从先序遍历还原二叉树
     */
    class Solution {
        public TreeNode recoverFromPreorder(String S) {
            if (S.length() < 1) return null;
            Deque<TreeNode> queue=new LinkedList<>();
            int i=0;
            while (i < S.length()) {
                //判断当前的数是第几层
                int level=0;
                while (S.charAt(i) == '-') {
                    level++;
                    i++;
                }

                //把多余的节点全部出栈，栈顶的就是父节点
                while (queue.size() > level) {
                    queue.pop();
                }

                int val=0;
                while (i < S.length() && S.charAt(i) != '-') {
                    val = val*10+ S.charAt(i)-'0';
                    i++;
                }

                TreeNode node=new TreeNode(val);
                if (!queue.isEmpty()) {
                    if (queue.peek().left == null) queue.peek().left=node;
                    else queue.peek().right=node;
                }

                queue.push(node);
            }

            return queue.getLast();
        }
    }
}
