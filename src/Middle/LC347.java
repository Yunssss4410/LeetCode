package Middle;

import java.util.*;

public class LC347 {
    /*
    347. 前 K 个高频元素
     */
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for (int num : nums) {
                map.put(num,map.getOrDefault(num,0)+1);
            }

            PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return map.get(o1)-map.get(o2);
                }
            });

            for (Integer key : map.keySet()) {
                if (queue.size() < k) {
                    queue.offer(key);
                }else if (map.get(key) > map.get(queue.peek())){
                    queue.poll();
                    queue.offer(key);
                }
            }

            int[] res=new int[k];
            for (int i = 0; i < k; i++) {
                res[i]=queue.poll();
            }
            return res;
        }
    }
}
