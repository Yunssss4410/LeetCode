package Middle;

import Extension.ListNode;

import java.util.List;

public class LC82 {
    /*
    82. 删除排序链表中的重复元素 II
    注释：左右指针同一起点，右指针一直找到与左指针不同的节点为止，看右指针跑了多远来判断是不是重复
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode node=new ListNode(0);
            ListNode ans=node;
            while (head != null)
            {
                ListNode left=head;
                ListNode right=head.next;
                int len=1;
                while (right !=null && right.val == left.val)
                {
                    len++;
                    right=right.next;
                }
                head=right;
                if (len == 1) {
                    node.next = left;
                    left.next = null;
                    node = node.next;
                }
            }
            return ans.next;
        }
    }
}
