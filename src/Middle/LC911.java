package Middle;

import java.util.*;

public class LC911 {
    /*
    911. 在线选举
    URL：https://leetcode-cn.com/problems/online-election/
     */
    class TopVotedCandidate {

        int[] time;
        int[] snum;
        public TopVotedCandidate(int[] persons, int[] times) {
            int len=times.length;
            time=new int[len];
            snum=new int[len];
            Map<Integer,Integer> map=new TreeMap<>();
            int bianhao=0,piaoshu=0;
            for (int i = 0; i < len; i++) {
                map.put(persons[i],map.getOrDefault(persons[i],0)+1);
                //获取票数最高的那个人的编号
                if (piaoshu <= map.get(persons[i])) {
                    bianhao=persons[i];
                    piaoshu=map.get(persons[i]);
                }
                time[i]=times[i];
                snum[i]=bianhao;
            }
        }

        public int q(int t) {
            int left=0,right=time.length-1,ans=0;
            while (left<right)
            {
                int mid=left+(right-left+1)/2;
                if (t >= time[mid]){
                    ans=snum[mid];
                    left=mid;
                }else {
                    right=mid-1;
                }
            }
            return ans;
        }
    }
}
