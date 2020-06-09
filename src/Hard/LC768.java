package Hard;

public class LC768 {
    public static void main(String[] args) {
        new Solution().maxChunksToSorted(new int[]{1,2,3,4});
    }
    /*
    768. 最多能完成排序的块 II
     */
    static class Solution {
        public int maxChunksToSorted(int[] arr) {
            int len=arr.length;
            if (len<=1) return 1;
            int[] max=new int[len];
            int[] min=new int[len];
            max[1]=arr[0];
            min[len-2]=arr[len-1];
            for (int i = 2; i < len; i++) {
                max[i] = Math.max(arr[i-1], max[i - 1]);
                min[len-i-1] = Math.min(arr[len-i], min[len-i]);
            }

            for (int i = 0; i < len; i++) {
                System.out.print(max[i]+" ");
            }
            System.out.println();
            for (int i = 0; i < len; i++) {
                System.out.print(min[i]+" ");
            }
            System.out.println();

            int res=1;
            int curnum=arr[0];
            for (int i = 0; i < len; i++) {
                System.out.println(max[i]+" "+curnum+" "+min[i]);
                if (max[i] <= curnum && curnum <= min[i]) {
                    curnum=arr[i+1];
                    res++;
                }else {
                    curnum=Math.max(curnum,arr[i]);
                }
            }

            return res;
        }
    }
}
