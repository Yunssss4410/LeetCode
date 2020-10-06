package Easy;

import Extension.ListNode;

public class LC203 {
    /*
    203. 移除链表元素
     */
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            if (head == null) return null;
            ListNode sentinel =new ListNode(0);
            sentinel .next=head;
            ListNode pre=sentinel;
            ListNode cur=head;
            while (cur != null) {
                if (cur.val == val) {
                    pre.next=cur.next;
                }else {
                    pre = cur;
                }
                cur = cur.next;
            }
            return sentinel.next;
        }
    }
}
