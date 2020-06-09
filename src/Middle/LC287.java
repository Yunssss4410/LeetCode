package Middle;

import java.util.HashSet;

public class LC287 {
    /*
    287. 寻找重复数
     */
    class Solution {
        public int findDuplicate(int[] nums) {
            HashSet<Integer> set=new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) {
                    return num;
                }else set.add(num);
            }
            return 0;
        }
    }
    //快慢指针
    class Solution_v2 {
        public int findDuplicate(int[] nums) {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while(slow != fast){
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            slow = 0;
            while(slow != fast){
                slow = nums[slow];
                fast = nums[fast];
            }
            return slow;
        }
    }
}
