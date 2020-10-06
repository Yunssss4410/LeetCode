package Easy;

import java.util.HashSet;

public class LC929 {
    /*
    929. 独特的电子邮件地址
     */
    class Solution {
        public int numUniqueEmails(String[] emails) {
            HashSet<String> set=new HashSet<>();
            StringBuilder builder=new StringBuilder();
            for (String email : emails) {
                for (char c : email.toCharArray()) {
                    if (c == '.') continue;
                    else if (c == '+' || c == '@') break;
                    else builder.append(c);
                }
                builder.append(email.substring(email.indexOf('@')));
                set.add(builder.toString());
                builder.setLength(0);
            }
            return set.size();
        }
    }
}
