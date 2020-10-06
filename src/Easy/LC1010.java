package Easy;

public class LC1010 {
    /*
    1010. 总持续时间可被 60 整除的歌曲
     */
    class Solution {
        public int numPairsDivisibleBy60(int[] time) {
            int[] yushu=new int[60];
            for (int i : time) {
                yushu[i%60]++;
            }
            int res=0;
            for (int i = 1; i < 30; i++) {
                res+= yushu[i]*yushu[60 - i];
            }
            return res+yushu[30]*(yushu[30]-1)/2+yushu[0]*(yushu[0]-1)/2;
        }
    }
}
