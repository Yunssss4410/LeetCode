package Middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class LC332 {
    /*
    332. 重新安排行程
     */
    class Solution {

        List<String> res=new ArrayList<>();
        HashMap<String, PriorityQueue<String>> map=new HashMap<>();

        public List<String> findItinerary(List<List<String>> tickets) {
            for (List<String> ticket : tickets) {
                String from = ticket.get(0),
                        to = ticket.get(1);
                if (!map.containsKey(from)) {
                    map.put(from, new PriorityQueue<String>());
                }
                map.get(from).offer(to);
            }
            dfs("JFK");
            return res;
        }

        public void dfs(String from){
            PriorityQueue<String> queue=map.get(from);
            while (queue !=null && !queue.isEmpty()) {
                String poll=queue.poll();
                dfs(poll);
            }
            res.add(0,from);
        }
    }
}
