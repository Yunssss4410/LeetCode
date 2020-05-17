package Middle;

import java.util.*;

public class LC210 {
    public static void main(String[] args) {
        int[] res=new Solution().findOrder(3,new int[][]{{1,0},{0,1},{1,2}});
        for (int re : res) {
            System.out.print(re+",");
        }
    }

    /*
    210. 课程表 II
    URL：https://leetcode-cn.com/problems/course-schedule-ii/
     */
    static class Solution {
        public int[] findOrder(int numCourses, int[][] prerequisites) {
            List<Integer> res=new ArrayList<>();

            Map<Integer,Set<Integer>> map=new HashMap<>();
            int[] du=new int[numCourses];
            for (int[] prerequisite : prerequisites) {
                du[prerequisite[0]]++;
                Set<Integer> set=map.getOrDefault(prerequisite[1], new HashSet<>());
                set.add(prerequisite[0]);
                map.put(prerequisite[1],set);
            }
            Queue<Integer> queue=new LinkedList<>();
            //初始化队列
            for (int i = 0; i < du.length; i++) {
                if (du[i]==0)
                    queue.offer(i);
            }
            if (queue.isEmpty()) return new int[0];
            while (!queue.isEmpty())
            {
                int cur=queue.poll();
                res.add(cur);
                Set<Integer> set=map.getOrDefault(cur, new HashSet<>());
                if (!set.isEmpty()) {
                    for (Integer integer : set) {
                        if (--du[integer] == 0) {
                            queue.offer(integer);
                        }
                    }
                }
            }
            if (res.size()!=numCourses) return new int[0];
            int[] ints=new int[res.size()];
            int i=0;
            for (Integer integer : res) {
                ints[i++]=integer;
            }
            return ints;
        }
    }
}
