package Easy;

import java.util.*;

public class LC225 {
    /*
    225. 用队列实现栈
     */
    class MyStack {

        List<Integer> list;
        /** Initialize your data structure here. */
        public MyStack() {
            list=new ArrayList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            list.add(x);
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return list.remove(list.size()-1);
        }

        /** Get the top element. */
        public int top() {
            return list.get(0);
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return list.size() == 0;
        }
    }
}
