package Middle;

import java.util.ArrayList;
import java.util.List;

public class LC386 {
    public static void main(String[] args) {
        new Solution().lexicalOrder(25);
    }
    /*
    386. 字典序排数
     */
    static class Solution {
        List<Integer> res;
        public List<Integer> lexicalOrder(int n) {
            res=new ArrayList<>();
            for (int i = 1; i < 10; i++) {
                dfs(n,i);
            }
            return res;
        }
        public void dfs(int n,int num) {
            if (num > n) return;
            res.add(num);
            num=num*10;
            for (int i = 0; i < 10; i++) {
                dfs(n,num+i);
            }
        }
    }
}
