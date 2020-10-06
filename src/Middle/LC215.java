package Middle;

import java.util.PriorityQueue;
import java.util.Queue;

public class LC215 {
    /*
    215. 数组中的第K个最大元素
     */
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Queue<Integer> queue=new PriorityQueue<>((o1, o2) -> o1-o2);
            for (int num : nums) {
                queue.add(num);
                if (queue.size() > k)
                    queue.poll();
            }
            return queue.poll();
        }
    }
}
