package Middle;

import Extension.ListNode;

public class LC86 {
    /*
    86. 分隔链表
     */
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode node=new ListNode(0);
            ListNode node2=new ListNode(0);
            ListNode ans=node;
            ListNode ans2=node2;
            while (head != null)
            {
                if (head.val < x) {
                    node.next=head;
                    node=node.next;
                }else {
                    node2.next=head;
                    node2=node2.next;
                }
                head=head.next;
            }
            node.next=ans2.next;
            node2.next=null;
            return ans.next;
        }
    }
}
