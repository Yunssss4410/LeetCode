package Easy;

public class LC1539 {
    /*
    1539. 第 k 个缺失的正整数
     */
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int left=0;
            int right=arr.length-1;
            while(left < right) {
                int mid=left+(right-left)/2;
                if (arr[mid]-mid-1 >= k)
                    right=mid;
                else
                    left=mid+1;
            }
            return k+left;
        }
    }
}
