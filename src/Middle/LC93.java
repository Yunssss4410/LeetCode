package Middle;

import java.util.ArrayList;
import java.util.List;

public class LC93 {
    /*
    93. 复原IP地址
     */
    class Solution {
        public List<String> restoreIpAddresses(String s) {
            List<String> list = new ArrayList<>();
            StringBuilder ip = new StringBuilder();

            for (int i = 1; i < 4; i++) {
                for (int j = 1; j < 4; j++) {
                    for (int k = 1; k < 4; k++) {
                        for (int l = 1; l < 4; l++) {
                            // i j k l 分别表示每一段的长度
                            if (i+j+k+l != s.length()) continue;
                            int n1 = Integer.parseInt(s.substring(0, i));
                            int n2 = Integer.parseInt(s.substring(i, i + j));
                            int n3 = Integer.parseInt(s.substring(i + j, i + j + k));
                            int n4 = Integer.parseInt(s.substring(i + j + k));

                            if (n1 <= 255 && n2 <= 255 && n3 <= 255 && n4 <= 255) {
                                ip.append(n1).append('.').append(n2).append('.')
                                        .append(n3).append('.').append(n4);
                                if (ip.length() == s.length() + 3) list.add(ip.toString());
                                ip.setLength(0);
                            }
                        }
                    }
                }
            }

            return list;
        }
    }
}
