package Middle;

import Extension.ListNode;

public class LC143 {
    /*
    143. 重排链表
     */
    class Solution {
        public void reorderList(ListNode head) {
            if (head == null || head.next == null || head.next.next == null)
                return;
            ListNode fast=head;
            ListNode slow=head;
            while (fast.next != null && fast.next.next != null) {
                fast=fast.next.next;
                slow=slow.next;
            }
            ListNode newHead = slow.next;
            slow.next = null;
            newHead = reverseList(newHead);
            while (newHead != null) {
                ListNode temp = newHead.next;
                newHead.next = head.next;
                head.next = newHead;
                head = newHead.next;
                newHead = temp;
            }
        }

        //翻转链表
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null)
                return head;
            ListNode cur = reverseList(head.next);
            head.next.next = head;
            head.next = null;
            return cur;
        }
    }
}
