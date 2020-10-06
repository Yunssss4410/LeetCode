package Middle;

import Extension.ListNode;
import Extension.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LC109 {
    /*
    109. 有序链表转换二叉搜索树
     */
    class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            List<Integer> list=new ArrayList<>();
            while (head != null) {
                list.add(head.val);
                head=head.next;
            }

           return sublist(list,0,list.size()-1);
        }

        public TreeNode sublist(List<Integer> list,int left,int right) {
            if (left > right) return null;
            int mid=left+(right-left)/2;
            TreeNode root=new TreeNode(list.get(mid));
            root.left=sublist(list,left,mid-1);
            root.right=sublist(list,mid+1,right);
            return root;
        }
    }
}
