package Easy;

public class LC520 {
    /*
    520. 检测大写字母
     */
    class Solution {
        public boolean detectCapitalUse(String word) {
            return word.equals(word.toLowerCase()) ||
                    (
                        word.substring(0,1).equals(word.substring(0,1).toUpperCase()) &&
                            (word.substring(1).equals(word.substring(1).toLowerCase())
                                || word.substring(1).equals(word.substring(1).toUpperCase()))
                    );
        }
    }
}
