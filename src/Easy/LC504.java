package Easy;

public class LC504 {
    /*
    504. 七进制数
     */
    class Solution {
        public String convertToBase7(int num) {
            if (num == 0) return "0";
            StringBuilder builder=new StringBuilder();
            boolean fushu=false;
            if (num<0)
            {
                fushu=true;
                num=-num;
            }
            while (num != 0)
            {
                builder.insert(0,num%7);
                num=num/7;
            }
            if (fushu) builder.insert(0,'-');
            return builder.toString();
        }
    }
}
