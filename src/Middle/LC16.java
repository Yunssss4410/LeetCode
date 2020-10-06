package Middle;

import java.util.Arrays;

public class LC16 {
    /*
    16. 最接近的三数之和
     */
    class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int n=nums.length;
            int best=10000000;
            for (int i = 0; i < n; i++) {
                if (i > 0 && nums[i]==nums[i-1]) continue;
                int j=i+1;
                int k=n-1;
                while (j < k)
                {
                    int sum=nums[i]+nums[k]+nums[j];
                    if (sum==target) return target;
                    if (Math.abs(sum-target) < Math.abs(best-target)) best=sum;
                    if (sum > target) {
                        int tmp=k-1;
                        while (j < tmp && nums[tmp] == nums[k]) tmp--;
                        k=tmp;
                    }else {
                        int tmp=j+1;
                        while (tmp < k && nums[tmp] == nums[j]) tmp++;
                        j=tmp;
                    }
                }
            }
            return best;
        }
    }
}
