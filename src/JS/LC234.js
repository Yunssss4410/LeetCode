/**
 * @param val
 * @constructor
 */
function ListNode(val) {
    this.val = val;
    this.next = null;
}

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    if (head == null || head.next == null) return false;
    let slow=head;
    let fast=head;
    while (fast.next != null && fast.next.next != null) {
        fast=fast.next.next;
        slow=slow.next;
    }
    slow=reverseList(slow.next);
    while (slow != null) {
        if (head.val !== slow.val) return false;
        head = head.next;
        slow = slow.next;
    }
    return true;
};

/**
 *
 * @param  {ListNode}head
 * @returns {ListNode}
 */
var reverseList = function(head) {
    if (head == null || head.next == null) {
        return head;
    }
    let cur = reverseList(head.next);
    head.next.next = head;
    head.next= null;
    return cur;
};
