package Middle;

import Extension.ListNode;

import java.util.List;

public class LC24 {
    /*
    24. 两两交换链表中的节点
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode pre=new ListNode(0);
            pre.next=head;
            ListNode temp=pre;
            while (temp.next != null && temp.next.next != null)
            {
                ListNode start=temp.next;
                ListNode end=temp.next.next;
                temp.next=end;
                start.next=end.next;
                end.next=start;
                temp=start;
            }
            return pre.next;
        }
    }
}
