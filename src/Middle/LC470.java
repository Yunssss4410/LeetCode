package Middle;

import Extension.SolBase;

public class LC470 {
    /*
    470. 用 Rand7() 实现 Rand10()
     */
    class Solution extends SolBase {
        public int rand10() {
          int a,b,c;
          do {
              a=rand7();
              b=rand7();
              c=a+(b-1)*7;
          }while (c>40);
          return (c-1)%10 +1;
        }
    }
}
