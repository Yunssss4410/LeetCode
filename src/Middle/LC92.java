package Middle;

import Extension.ListNode;

public class LC92 {
    /*
    92. 反转链表 II
     */
    class Solution {
        public ListNode reverseBetween(ListNode head, int m, int n) {
            ListNode node=new ListNode(0);
            node.next=head;

            //pre为第m个的前一个，head为第m个 （本题从1开始数，不是0）
            ListNode pre=node;
            for (int i = 1; i < m; i++) {
                pre=pre.next;
            }
            head=pre.next;

            for (int i = m; i < n; i++) {
                ListNode next=head.next;
                head.next=next.next;
                next.next=pre.next;
                pre.next=next;
            }

            return node.next;
        }

    }
}
