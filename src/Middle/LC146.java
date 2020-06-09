package Middle;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LC146 {
    /*
    146. LRU缓存机制
     */
    class LRUCache {

        int capacity;
        HashMap<Integer,Integer> map;
        Queue<Integer> queue;
        public LRUCache(int capacity) {
            this.map=new HashMap<>();
            this.capacity=capacity;
            this.queue=new LinkedList<>();
        }

        public int get(int key) {
            if (queue.contains(key)) {
                //更新位置到最新
                queue.remove(key);
                queue.add(key);
                return map.get(key);
            }else {
                return -1;
            }
        }

        public void put(int key, int value) {
            if (queue.contains(key)) {
                queue.remove(key);
                queue.add(key);
                map.put(key,value);
            }else if (capacity==0){
                map.remove(queue.poll());
                queue.add(key);
                map.put(key,value);
            }else {
                queue.add(key);
                map.put(key,value);
                capacity--;
            }
        }
    }
}
