package Easy;

import Extension.ListNode;

import java.util.Stack;

public class LC234 {
    /*
    234. 回文链表
     */
//    class Solution {
//        public boolean isPalindrome(ListNode head) {
//            if (head == null || head.next == null) return true;
//            Stack<ListNode> stack = new Stack<>();
//            ListNode node = new ListNode(0);
//            node.next = head;
//            while (head != null) {
//                stack.push(head);
//                head = head.next;
//            }
//            node = node.next;
//            int len=stack.size()/2;
//            for (int i = 0; i < len + 1; i++) {
//                if (node.val != stack.pop().val) return false;
//                node = node.next;
//            }
//            return true;
//        }
//    }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;
            ListNode slow=head;
            ListNode fast=head;
            while (fast.next != null && fast.next.next != null ) {
                slow=slow.next;
                fast=fast.next.next;
            }
            slow=reverseList(slow);
            while (slow != null) {
                if (head.val != slow.val) return false;
                head=head.next;
                slow=slow.next;
            }
            return true;
        }

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
