package Middle;

import java.util.HashMap;

public class LC974 {
    public static void main(String[] args) {
        int sum=10;
        int K=-3;
        System.out.println((sum % K + K) % K);
    }
    /*
    974. 和可被 K 整除的子数组
     */
    class Solution {
        public int subarraysDivByK(int[] A, int K) {
            HashMap<Integer, Integer> record = new HashMap<>();
            record.put(0, 1);
            int sum = 0, ans = 0;
            for (int elem: A) {
                sum += elem;
                // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
                int modulus = (sum % K + K) % K;
                int same = record.getOrDefault(modulus, 0);
                ans += same;
                record.put(modulus, same + 1);
            }
            return ans;
        }
    }
}
