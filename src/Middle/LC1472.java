package Middle;

import java.util.ArrayList;

public class LC1472 {
    /*
    1472. 设计浏览器历史记录
     */
    class BrowserHistory {

        ArrayList<String> list;
        int curindex;
        int end;
        public BrowserHistory(String homepage) {
            list=new ArrayList<>();
            list.add(homepage);
            curindex=0;
            end=0;
        }

        public void visit(String url) {
            curindex++;
            if (list.size() <= curindex)
                list.add(url);
            else
                list.set(curindex,url);
            end=curindex;
        }

        public String back(int steps) {
            if (curindex-steps <= 0) curindex=0;
            else curindex=curindex-steps;
            return list.get(curindex);
        }

        public String forward(int steps) {
            if (steps+curindex >= end) curindex=end;
            else curindex=steps+curindex;
            return list.get(curindex);
        }
    }
}


