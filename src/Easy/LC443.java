package Easy;

public class LC443 {
    /*
    443. 压缩字符串
     */
    class Solution {
        public int compress(char[] chars) {
            char curchar=chars[0];
            int curlen=1;
            int index=0;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == curchar) {
                    curlen++;
                }else {
                    if (curlen == 1) {
                        index++;
                    }else {
                        chars[index++]=curchar;
                        String s=String.valueOf(curlen);
                        for (char c : s.toCharArray()) {
                            chars[index++]=c;
                        }
                    }
                    curchar=chars[i];
                    curlen=1;
                }
            }
            if (curlen == 1) {
                index++;
            }else {
                chars[index++]=curchar;
                String s=String.valueOf(curlen);
                for (char c : s.toCharArray()) {
                    chars[index++]=c;
                }
            }
            return index-1;
        }

//        public int compress(char[] chars) {
//            int[] ints=new int[26];
//            for (char aChar : chars) {
//                ints[aChar-'a']++;
//            }
//            int index=0;
//            int len=0;
//            for (int i = 0; i < 26; i++) {
//                if (ints[i] <= 0) continue;
//                chars[index++]= (char) ('a'+i);
//                len++;
//                if (ints[i] != 1)   {
//                    String s=String.valueOf(ints[i]);
//                    for (char c : s.toCharArray()) {
//                        chars[index++]=c;
//                        len++;
//                    }
//                }
//            }
//            return len;
//        }
    }
}
