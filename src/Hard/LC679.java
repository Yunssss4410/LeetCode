package Hard;

import java.util.ArrayList;
import java.util.List;

public class LC679 {
    /*
    679. 24 点游戏
     */
    class Solution {
        public boolean judgePoint24(int[] nums) {
            List<Double> A = new ArrayList<>();
            for (int v: nums)
                A.add((double) v);
            return solve(A);
        }
        private boolean solve(List<Double> nums) {
            int size=nums.size();
            // 没有可计算的，证明无解
            if (size == 0) return false;
            // le-6是浮点计算的精度误差，这里判断误差小于1e-6，这样就是正确结果
            if (size == 1) return Math.abs(nums.get(0) - 24) < 1e-6;


            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j) continue;
                    // 找到其他元素赛进下一轮
                    ArrayList<Double> nums2 = new ArrayList<>();
                    for (int k = 0; k < size; k++) {
                        if (k != i && k != j) {
                            nums2.add(nums.get(k));
                        }
                    }

                    // k的四种计算情况
                    for (int k = 0; k < 4; k++) {
                        // 性能优化，当k<2时，对于+ or *不考虑顺序，
                        // 所以k<2 时，j > i与i > j的结果相同，所以有部分不用考虑
                        if (k < 2 && j > i) continue;
                        if (k == 0) nums2.add(nums.get(i) + nums.get(j));
                        if (k == 1) nums2.add(nums.get(i) * nums.get(j));
                        if (k == 2) nums2.add(nums.get(i) - nums.get(j));
                        // 避免除数为0
                        if (k == 3) {
                            if (nums.get(j) != 0) {
                                nums2.add(nums.get(i) / nums.get(j));
                            } else {
                                continue;
                            }
                        }
                        // 在这次计算后，判断剩下的元素是否符合要求
                        // 每次缩小计算范围
                        if (solve(nums2)) return true;
                        // 移除最后一个计算结果，因为最后的记过不满足要求
                        // 就是一种回溯方法，将前面添加的结果删除
                        nums2.remove(nums2.size() - 1);
                    }
                }
            }
            return false;
        }
    }
}
