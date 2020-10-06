package Easy;

public class LC67 {
    /*
    67. 二进制求和
     */
    class Solution {
        public String addBinary(String a, String b) {
            StringBuilder builder = new StringBuilder();
            int alen = a.length();
            int blen = b.length();
            for (int i = Math.abs(alen - blen); i > 0; i--) {
                builder.append("0");
            }
            if (alen < blen) a = builder.toString() + a;
            else b = builder.toString() + b;
            builder.setLength(0);
            int cin = 0;
            for (int i = Math.max(alen, blen) - 1; i >= 0; i--) {
                int sum = a.charAt(i) - '0' + b.charAt(i) - '0' + cin;
                builder.append(sum % 2);
                cin = sum / 2;
            }
            if (cin == 1)
                builder.append(cin);

            return builder.reverse().toString();
        }
    }
}
