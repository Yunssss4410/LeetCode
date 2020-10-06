package Middle;

import java.util.List;

public class LC841 {
    /*
    841. 钥匙和房间
     */
    class Solution {
        boolean[] b;
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            b=new boolean[rooms.size()];
            //初始化钥匙
            b[0]=true;
            dfs(rooms,rooms.get(0));
            for (boolean b1 : b) {
                if (!b1) return false;
            }
            return true;
        }

        public void dfs(List<List<Integer>> rooms,List<Integer> keys) {
            if (keys.isEmpty()) return;
            for (Integer key : keys) {
                if(b[key]) continue;
                
                b[key]=true;
                dfs(rooms,rooms.get(key));
            }
        }
    }
}
