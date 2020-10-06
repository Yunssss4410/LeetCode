package Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC18 {
    /*
    18. 四数之和
     */
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> lists=new ArrayList<>();
            if (nums.length < 4) return lists;
            Arrays.sort(nums);
            int len=nums.length;
            if (target < nums[0] + nums[1] + nums[2] + nums[3]
                    || target > nums[len - 1] + nums[len - 2] + nums[len - 3] + nums[len - 4]) {
                return lists;
            }

            for (int i = 0; i < len - 3; i++) {

                if (i > 0 && nums[i]==nums[i-1]) continue;

                for (int j = i+1; j < len-2; j++) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                    int l=j+1;
                    int r=len-1;
                    while (l < r)
                    {
                        int sum=nums[i]+nums[j]+nums[l]+nums[r];
                        if (sum == target) {
                            lists.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                            while (++l < r && nums[l]==nums[l-1]) ;
                            while (--r > l && nums[r]==nums[r+1]) ;
                        }else if (sum > target) {
                            while (--r > l && nums[r]==nums[r+1]) ;
                        }else {
                            while (++l < r && nums[l]==nums[l-1]) ;
                        }
                    }
                }
            }
            return lists;
        }
    }
}
