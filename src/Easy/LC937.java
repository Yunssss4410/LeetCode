package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LC937 {
    /*
    937. 重新排列日志文件
    URL:https://leetcode-cn.com/problems/reorder-data-in-log-files/
    摘抄解读：
    重新定义本题内容：
    给定一串日志，例如：['a1 9 2 3 1', 'g1 act car']；
     #【定义】a1 9 2 3 1 这类，除了开头标志 a1 外，仅由数字组成的，叫 **数字日志**；
     #【定义】a1 act car 这类，除了开头标志 al 外，仅由小写字母组成的，叫 **字母日志**；
     #【排序规则】将日志重新排序，使得所有 **字母日志** 都排在 **数字日志** 之前；
     #【排序规则】**字母日志** 在内容不同时，忽略标识符后，按内容字母顺序排序；在内容相同时，按标识符排序；
     #【排序规则】**数字日志** 按原来的顺序排列；
     */
    class Solution {
        public String[] reorderLogFiles(String[] logs) {
            List<String> eng=new ArrayList<>();
            List<String> num=new ArrayList<>();
            for (String log : logs) {
                int i=log.indexOf(' ')+1;
                if (log.charAt(i) >= '0' && log.charAt(i) <= '9') {
                    num.add(log);
                }else {
                    eng.add(log);
                }
            }
            Collections.sort(eng, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    int i = o1.indexOf(" ");
                    String t1 = o1.substring(0, i);
                    String m1 = o1.substring(i + 1);

                    i = o2.indexOf(" ");
                    String t2 = o2.substring(0, i);
                    String m2 = o2.substring(i + 1);

                    int cmp=m1.compareTo(m2);
                    if (cmp==0){
                        return t1.compareTo(t2);
                    }
                    return cmp;
                }
            });
            eng.addAll(num);
            return eng.toArray(new String[eng.size()]);
        }
    }
}
