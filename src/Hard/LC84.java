package Hard;

import java.util.Stack;

public class LC84 {
    public static void main(String[] args) {
        new Solution().largestRectangleArea(new int[]{2,1,5,6,2,3});
    }
    /*
    84. 柱状图中最大的矩形
     */
    static class Solution {
        public int largestRectangleArea(int[] heights) {
            int len=heights.length;
            if (len<1) return 0;
            int[] left = new int[len];
            int[] right = new int[len];
            Stack<Integer> stack=new Stack<>();
            for (int i = 0; i < len; i++) {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                {
                    stack.pop();
                }
                left[i]=stack.isEmpty()?-1:stack.peek();
                stack.push(i);
            }

            stack.clear();

            for (int i = len-1; i >= 0; i--) {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i])
                {
                    stack.pop();
                }
                right[i]=stack.isEmpty()?len:stack.peek();
                stack.push(i);
            }

            int res=0;
            for (int i = 0; i < len; i++) {
                res=Math.max(res,(right[i]-left[i]-1)*heights[i]);
            }
            return res;
        }
    }
}
