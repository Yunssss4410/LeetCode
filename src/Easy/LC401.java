package Easy;

import java.util.ArrayList;
import java.util.List;

public class LC401 {
    public static void main(String[] args) {
        System.out.println(new Solution().readBinaryWatch(2));
    }
    /*
    401. 二进制手表
     */
    static class Solution {
        List<String> list=new ArrayList<>();
        public List<String> readBinaryWatch(int num) {
            if (num > 10) return list;
            dfs(num,0,0,new StringBuilder("0000000000"));
            return list;
        }

        public void dfs(int num,int curnum,int start,StringBuilder curdata) {
            if (num == curnum) {
                String s=getTime(curdata.toString());
                if (!s.isEmpty())
                    list.add(s);

            }

            for (int i = start; i < 10; i++) {
                curdata.setCharAt(i,'1');
                dfs(num,curnum+1,i+1,curdata);
                curdata.setCharAt(i,'0');

            }
        }

        public String getTime(String data) {
            StringBuilder builder=new StringBuilder();
            int hour=Integer.parseUnsignedInt(data.substring(0,4),2);
            int minute=Integer.parseUnsignedInt(data.substring(4),2);
            if (hour > 11 || minute > 59) return "";
            builder.append(hour)
                    .append(":")
                    .append(String.format("%02d",minute));
            return builder.toString();
        }
    }
}
