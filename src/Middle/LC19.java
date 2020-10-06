package Middle;

import Extension.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LC19 {
    /*
    19. 删除链表的倒数第N个节点
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode start=head;
            ListNode end=head;
            for (int i = 0; i < n; i++) {
                end=end.next;
            }
            if (end == null) return head.next;

            while (end.next != null)
            {
                start=start.next;
                end=end.next;
            }
            start.next=start.next.next;
            return head;
        }
    }
}
