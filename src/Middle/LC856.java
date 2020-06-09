package Middle;

import java.util.Stack;

public class LC856 {
    public static void main(String[] args) {
        int num=new Solution().scoreOfParentheses("()()");
        System.out.println(num);
    }
    /*
    856. 括号的分数
     */
   static class Solution {
        public int scoreOfParentheses(String S) {
            Stack<String> stack=new Stack<>();
            for (char c : S.toCharArray()) {
                if (c=='(') {
                    stack.push("(");
                }else {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                        stack.push("1");
                    }else {
                        int num=0;
                        while (!stack.isEmpty() && !stack.peek().equals("("))
                        {
                            num+=Integer.parseInt(stack.pop());
                        }
                        stack.pop();
                        stack.push(String.valueOf(num*2));
                    }
                }
            }
            if (stack.size()>1) {
                int res=0;
                while (!stack.isEmpty())
                    res+=Integer.parseInt(stack.pop());
                return res;
            }
            return Integer.parseInt(stack.pop());
        }
    }
}
