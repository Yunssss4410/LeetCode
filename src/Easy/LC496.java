package Easy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class LC496 {
    /*
    496. 下一个更大元素 I
     */
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            if (nums2.length < 1) return new int[0];
            HashMap<Integer,Integer> map=new HashMap<>();//位置索引，下一个更大的数
            Stack<Integer> stack=new Stack<>();
            stack.add(nums2[0]);
            for (int num : nums2) {
                while (!stack.isEmpty() && stack.peek() < num)
                    map.put(stack.pop(),num);
                stack.push(num);
            }
            for (int i = 0; i < nums1.length; i++) {
                nums1[i]=map.getOrDefault(nums1[i],-1);
            }
            return nums1;
        }
    }
}
