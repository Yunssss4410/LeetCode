package Middle;

import java.util.*;

public class LCP03 {
    public static void main(String[] args) {
        new Solution().robot("URR",new int[][]{{1,0},{2,3}},3,2);
    }
    /*
    LCP 03. 机器人大冒险
     */
    static class Solution {
        public boolean robot(String command, int[][] obstacles, int x, int y) {
            Map<Integer,int[]> map=new HashMap<>();
            int i=0,j=0,index=0;
            while (!(i==x && j==y))
            {
                if (command.charAt(index)=='U') j++;
                else i++;
                map.put(i+j,new int[]{i,j});
                if (++index == command.length()) index=0;
            }

            for (int[] obstacle : obstacles) {
                int key=obstacle[0]+obstacle[1];
                int[] ints=map.getOrDefault(key,new int[2]);
                if (ints[0]==obstacle[0] && ints[1]==obstacle[1]) return false;
            }
            return true;
        }
    }

    class Solution_v2 {
        public boolean robot(String command, int[][] obstacles, int x, int y) {
            int[][] path=new int[command.length()][2];
            int i=0,j=0,index=0;
            for (char c : command.toCharArray()) {
                if (c=='U') j++;
                else i++;
                path[index][0]=i;
                path[index][1]=j;
                index++;
            }

            for (int[] obstacle : obstacles) {
                if (obstacle[0] > x || obstacle[1] > y) continue;
                if (checkPoint(path,obstacle[0],obstacle[1],i,j)) {
                    return false;
                }
            }
            return checkPoint(path,x,y,i,j);
        }
        //检查x,y这个点在不在路径上
        public boolean checkPoint(int[][] path,int x,int y,int xStep,int yStep) {
            for (int[] ints : path) {
                if ((x-ints[0])%xStep==0 && (y-ints[1])%yStep==0 && (x-ints[0])/xStep == (y-ints[1])/yStep) {
                    return true;
                }
            }
            return false;
        }
    }
}
