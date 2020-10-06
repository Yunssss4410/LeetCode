package Easy;

import Extension.ListNode;

public class LC160 {
    /*
    160. 相交链表
     */
    class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode ha = headA, hb = headB;
            while (ha != hb) {
                ha = ha != null ? ha.next : headB;
                hb = hb != null ? hb.next : headA;
            }
            return ha;
        }
    }
}
