package Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC90 {
    /*
    90. 子集 II
     */
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            lists.add(new ArrayList<>());
            if (nums.length == 0) return lists;

            Arrays.sort(nums);

            List<Integer> list = new ArrayList<>();
            list.add(nums[0]);
            lists.add(list);

            int len = 1;
            for (int i = 1; i < nums.length; i++) {
                int size = lists.size();

                if (nums[i] != nums[i - 1]) len = size;

                for (int j = size - len; j < size; j++) {
                    list = new ArrayList<>(lists.get(j));
                    list.add(nums[i]);
                    lists.add(list);
                }
            }
            return lists;
        }
    }
}
