package Easy;

import Extension.ListNode;

public class LC83 {
    /*
    83. 删除排序链表中的重复元素
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;
            ListNode pre=head;
            ListNode node=pre.next;
            while (node != null) {
                if (node.val == pre.val) {
                    pre.next=node.next;
                }else {
                    pre=pre.next;
                }
                node=node.next;
            }
            return head;
        }
    }
}
