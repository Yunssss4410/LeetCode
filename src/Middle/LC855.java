package Middle;

import java.util.TreeSet;

public class LC855 {
    /*
    855. 考场就座
     */
    class ExamRoom {
        int N;
        TreeSet<Integer> set;
        public ExamRoom(int N) {
            this.N=N;
            set=new TreeSet<>();
        }

        public int seat() {
            if (set.isEmpty()) {
                set.add(0);
                return 0;
            }
            else if (set.size()==1) {
                set.add(N-1);
                return N-1;
            }
            else {
                int pre=0,left=0,right=0,max=0;
                for (Integer integer : set) {
                    int len=integer-pre;
                    if (len > max) {
                        max=len;
                        left=pre;
                        right=integer;
                    }
                    pre=integer;
                }
                int pos=left+(right-left)/2;
                set.add(pos);
                return pos;
            }
        }

        public void leave(int p) {
            set.remove(p);
        }
    }

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */
}
