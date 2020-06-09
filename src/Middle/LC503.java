package Middle;

public class LC503 {
    /*
    503. 下一个更大元素 II
     */
    class Solution {
        public int[] nextGreaterElements(int[] nums) {
            if (nums.length==0) return new int[0];
            int[] ints=new int[nums.length];
            int max=nums[0];
            for (int num : nums) {
                if (num>max) max=num;
            }

            for (int i = 0; i < ints.length; i++) {
                if (nums[i] == max) ints[i]=-1;
                else {
                    int index=i+1;
                    for (int j = 0; j < ints.length; j++) {
                        if (index==ints.length-1) index=0;
                        if (nums[index++] > nums[i]) {
                            ints[i]=nums[index];
                            break;
                        }
                    }
                }
            }
            return ints;
        }
    }
}
