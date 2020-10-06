package Easy;

import Extension.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LCM02_01 {
    /*
    面试题 02.01. 移除重复节点
     */
    class Solution {
        public ListNode removeDuplicateNodes(ListNode head) {
            if (head == null) return head;
            Set<Integer> set=new HashSet<>();
            set.add(head.val);
            ListNode node=head;
            while (node.next != null)
            {
                ListNode nextnode=node.next;
                if (!set.contains(nextnode.val)) {
                    set.add(nextnode.val);
                    node=node.next;
                }else {
                    node.next=node.next.next;
                }
            }
            return head;
        }
    }
}
