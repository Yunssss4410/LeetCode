package Middle;

import java.util.*;

public class LC433 {
    public static void main(String[] args) {
        int num=new Solution().minMutation("AAAAACCC","AACCCCCC",new String[]{"AAAACCCC", "AAACCCCC", "AACCCCCC"});
        System.out.print(num);
    }
    /*
    433. 最小基因变化
     */
    static class Solution {
        public int minMutation(String start, String end, String[] bank) {
            Set<String> set=new HashSet<>(Arrays.asList(bank));
            Queue<String> queue=new LinkedList<>();
            queue.add(start);
            int res=0;
            while (!queue.isEmpty())
            {
                res++;
                int size=queue.size();
                //遍历第res层
                for (int i = 0; i < size; i++) {
                    //当前基因
                    String cur=queue.poll();
                    HashSet<String> tempset=new HashSet<>();
                    for (String s : set) {
                        if (canChange(cur,s)) {
                            if (s.equals(end)) return res;
                            queue.add(s);
                            tempset.add(s);
                        }
                    }
                    set.removeAll(tempset);
                    tempset.clear();
                }
            }
            return -1;
        }

        public boolean canChange(String cur,String next) {
            int notsame=0;
            for (int i = 0; i < 8; i++) {
                if (cur.charAt(i) != next.charAt(i)) {
                    notsame++;
                    if (notsame > 1) return false;
                }
            }
            return true;
        }
    }
}
