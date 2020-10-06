package Middle;

import java.util.ArrayList;
import java.util.List;

public class LC78 {
    /*
    78. 子集
     */
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> lists=new ArrayList<>();
            lists.add(new ArrayList<>());
            for (int num : nums) {
                int size = lists.size();
                for (int j = 0; j < size; j++) {
                    List<Integer> list = new ArrayList<>(lists.get(j));
                    list.add(num);
                    lists.add(list);
                }
            }
            return lists;
        }
    }
}
