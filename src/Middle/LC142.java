package Middle;

import Extension.ListNode;

import java.util.List;

public class LC142 {
    /*
    142. 环形链表 II
     */
    class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast=head;
            ListNode slow=head;
            do {
                if (fast == null || fast.next == null) return null;
                fast = fast.next.next;
                slow = slow.next;

            } while (fast != slow);
            fast=head;
            while (head != slow)
            {
                head=head.next;
                slow=slow.next;
            }
            return head;
        }
    }
}
