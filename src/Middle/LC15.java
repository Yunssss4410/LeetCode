package Middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {
    /*
    15. 三数之和
     */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            int len = nums.length;
            if(len < 3) return ans;
            Arrays.sort(nums);
            for (int i = 0; i < len; i++) {
                if (nums[i] > 0) return ans;
                if (i>0 && nums[i] == nums[i-1]) continue;
                int left=i+1;
                int right=len-1;
                while (left < right) {
                    int sum=nums[i]+nums[left]+nums[right];
                    if (sum==0) {
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while (left<right && nums[left]==nums[left+1]) left++;
                        while (left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }
                    else if (sum < 0) left++;
                    else right--;
                }
            }
            return ans;
        }
    }
}
