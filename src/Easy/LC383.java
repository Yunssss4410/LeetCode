package Easy;

public class LC383 {
    /*
    383. 赎金信
     */
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            if (ransomNote.length() > magazine.length()) return false;
            int[] cnt=new int[26];
            for (char c : magazine.toCharArray()) {
                cnt[c-'a']++;
            }
            for (char c : ransomNote.toCharArray()) {
                if (cnt[c-'a'] == 0) return false;
                cnt[c-'a']--;
            }
            return true;
        }
    }
}
