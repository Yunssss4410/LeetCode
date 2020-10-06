package Middle;

import Extension.ListNode;

public class LC2 {
    /*
    2. 两数相加
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int cin = 0;
            ListNode node = new ListNode(0);
            ListNode head = node;
            while (l1 != null || l2 != null) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = x + y + cin;
                cin = sum / 10;
                node.next = new ListNode(sum % 10);
                node = node.next;
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            if (cin == 1)
                node.next = new ListNode(1);
            return head.next;
        }
    }
}
