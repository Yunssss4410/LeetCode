package Easy;

public class LC922 {
    /*
    922. 按奇偶排序数组 II
     */
    class Solution {
        public int[] sortArrayByParityII(int[] A) {
            if (A.length < 2) return A;
            int i=0;
            int j=1;
            while (i < A.length) {
                //如果A[i]是奇数，找个奇数给他填补
                if (A[i] % 2 == 1) {
                    while (j < A.length && A[j]%2 == 0) j+=2;
                    swap(A,i,j);
                }
                i+=2;
            }
            return A;
        }

        public void swap(int[] A,int i,int j) {
            int tmp=A[i];
            A[i]=A[j];
            A[j]=tmp;
        }
    }
}
