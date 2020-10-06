package Middle;

import java.util.ArrayList;
import java.util.List;

public class LC71 {
    public static void main(String[] args) {
        new Solution().simplifyPath("/a//b////c/d//././/..");
    }
    /*
    71. 简化路径
     */
   static class Solution {
        public String simplifyPath(String path) {
            List<String> list=new ArrayList<>();
            StringBuilder builder=new StringBuilder();
            for (char c : path.toCharArray()) {
                if (c=='/') {
                    if (builder.length()==0 || builder.toString().equals(".")) {
                        builder.setLength(0);
                        continue;
                    }
                    if (builder.toString().equals("..")) {
                        if (list.size() != 0)
                            list.remove(list.size()-1);
                    }else {
                        list.add(builder.toString());
                    }
                    builder.setLength(0);
                }else {
                    builder.append(c);
                }
            }
            if (builder.toString().equals("..")) {
                if (list.size() != 0)
                    list.remove(list.size()-1);
            }else if (!builder.toString().equals(".")) {
                if (builder.length()!=0)
                    list.add(builder.toString());
            }
            if (list.size()==0) return  "/";
            builder.setLength(0);
            for (String s : list) {
                builder.append('/').append(s);
            }
            return builder.toString();
        }
    }
}
