package Middle;

import java.util.ArrayList;
import java.util.List;

public class LC228 {
    /*
    228. 汇总区间
     */
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> list=new ArrayList<>();
            if (nums.length < 1) return list;
            int head=nums[0];
            int end=nums[0];
            for (int j = 1; j < nums.length; j++) {
                if (nums[j]==end+1) {
                    end++;
                }else {
                    if (head != end)
                        list.add(head+"->"+end);
                    else
                        list.add(String.valueOf(head));
                    head=end=nums[j];
                }
            }
            if (head != end)
                list.add(head+"->"+end);
            else
                list.add(String.valueOf(head));
            return list;
        }
    }
}
