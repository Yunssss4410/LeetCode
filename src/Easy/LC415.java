package Easy;

public class LC415 {
    /*
    415. 字符串相加
     */
    class Solution {
//        public String addStrings(String num1, String num2) {
//            int cin=0;
//            //nu1永远为最长的
//            if (num1.length() < num2.length()) {
//                String temp=num1;
//                num1=num2;
//                num2=temp;
//            }
//            StringBuilder builder=new StringBuilder();
//            int len=num1.length()-num2.length();
//            for (int i = 0; i < len; i++) {
//                builder.append("0");
//            }
//            num2=builder.append(num2).toString();
//            builder.setLength(0);
//
//            for (int i = num1.length()-1; i >= 0; i--) {
//                int sum=num1.charAt(i)-'0'+num2.charAt(i)-'0'+cin;
//                builder.insert(0,sum%10);
//                cin=sum/10;
//            }
//            if (cin != 0)
//                builder.insert(0,cin);
//            return builder.toString();
//        }

        public String addStrings(String num1, String num2) {
            if (num1.length() < num2.length()) {
                String temp=num1;
                num1=num2;
                num2=temp;
            }
            int i=num1.length()-1;
            int j=num2.length()-1;
            int cin=0;
            StringBuilder builder=new StringBuilder();

            while (i >=0 && j>=0)
            {
                int sum=num1.charAt(i--)-'0'+num2.charAt(j--)-'0'+cin;
                builder.insert(0,sum%10);
                cin=sum/10;
            }
            while (i>=0)
            {
                int sum=num1.charAt(i--)-'0'+cin;
                builder.insert(0,sum%10);
                cin=sum/10;
            }
            if (cin != 0)
                builder.insert(0,cin);
            return builder.toString();
        }
    }
}
