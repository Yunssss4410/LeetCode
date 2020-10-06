package Middle;

import Extension.ListNode;

public class LC61 {
    /*
    61. 旋转链表
     */
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null) return head;
            int n = 1;
            ListNode left = head;
            ListNode right = head;
            while (right.next != null) {
                n++;
                right = right.next;
            }
            k = k % n;

            for (int i = 1; i < n-k; i++) {
                left = left.next;
            }
            right.next=head;
            ListNode node=left.next;
            left.next=null;
            return node;
        }
    }
}
