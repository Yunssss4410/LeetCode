package Hard;

import jdk.internal.org.objectweb.asm.Handle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC41 {
    /*
    41. 缺失的第一个正数
     */
    class Solution {
//        public int firstMissingPositive(int[] nums) {
//            if (nums.length < 1) return 1;
//            Set<Integer> set=new HashSet<>();
//            for (int num : nums) {
//                set.add(num);
//            }
//            for (int i = 1; i < nums.length; i++) {
//                if (!set.contains(i)) return i;
//            }
//            return nums.length;
//        }

        public int firstMissingPositive(int[] nums) {
            int len=nums.length;
            if (len < 1) return 1;
            for (int i = 0; i < len; i++) {
                //一直交换，直到两个位置上的数有一个或两个正确
                while (nums[i] > 0 && nums[i] < len && nums[nums[i] - 1] != nums[i] && nums[i] != i+1)
                    swap(nums,i,nums[i]-1);
            }
            for (int i = 0; i < len; i++) {
                if (nums[i] != i+1) return i+1;
            }
            return len+1;
        }

        public void swap(int[] nums,int i,int j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
