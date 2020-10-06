package Middle;

import java.util.Stack;

public class LC739 {
    /*
    739. 每日温度
     */
    class Solution {
        public int[] dailyTemperatures(int[] T) {
            int len=T.length;
            int[] res=new int[len];
            if (len < 1) return res;
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < len; i++) {
                int temperature = T[i];
                while (!stack.isEmpty() && temperature > T[stack.peek()]) {
                    int prevIndex = stack.pop();
                    res[prevIndex] = i - prevIndex;
                }
                stack.push(i);
            }
            return res;
        }
    }
}
