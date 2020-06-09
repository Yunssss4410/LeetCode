package Easy;

import java.util.ArrayList;
import java.util.List;

public class LC1431 {
    /*
    1431. 拥有最多糖果的孩子
     */
    class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            int max=Integer.MIN_VALUE;
            for (int candy : candies) {
                if (candy > max) max=candy;
            }
            List<Boolean> list=new ArrayList<>();
            for (int candy : candies) {
                list.add(candy + extraCandies >= max);
            }
            return list;
        }
    }
}
