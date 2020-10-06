package Easy;

import java.util.ArrayList;
import java.util.List;

public class LC118 {
    public static void main(String[] args) {
        new Solution().generate(3);
    }
    /*
    118. 杨辉三角
     */
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> lists = new ArrayList<>();
            List<Integer> prelist=null;
            for (int i = 0; i < numRows; i++) {
                List<Integer> curlist=new ArrayList<>();
                lists.add(curlist);
                for (int j = 0; j < i+1; j++) {
                    if (j==0 || j==i) curlist.add(1);
                    else {
                        curlist.add(prelist.get(j)+prelist.get(j-1));
                    }
                }
                prelist=curlist;
            }
            //System.out.println(lists);
            return lists;
        }
    }
}
