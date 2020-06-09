package Middle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC990 {
    public static void main(String[] args) {
        //new Solution().equationsPossible(new String[]{"a==b","b!=c","c==a"});
    }
    /*
    990. 等式方程的可满足性
     */
    //未调试成功
//    static class Solution {
//        public boolean equationsPossible(String[] equations) {
//            Map<String, Set<String>> samemap=new HashMap<>();
//            Map<String, Set<String>> notsamemap=new HashMap<>();
//            for (String equation : equations) {
//                StringBuilder parm1=new StringBuilder();
//                StringBuilder parm2=new StringBuilder();
//                int isdenghao=0;
//                for (char c : equation.toCharArray()) {
//                    if (c == '=') {
//                        isdenghao++;
//                        continue;
//                    }else if (c == '!') {
//                        continue;
//                    }
//
//                    if (isdenghao == 0) {
//                        parm1.append(c);
//                    }else {
//                        parm2.append(c);
//                    }
//                }
//                String s1=parm1.toString();
//                String s2=parm2.toString();
//                if (isdenghao == 2) {
//                    Set<String> set1=samemap.getOrDefault(s1,new HashSet<>());
//                    Set<String> set2=samemap.getOrDefault(s2,new HashSet<>());
//                    set1.add(s2);
//                    samemap.put(s1,set1);
//                    set2.add(s1);
//                    samemap.put(s2,set2);
//                }else {
//                    Set<String> set1=notsamemap.getOrDefault(s1,new HashSet<>());
//                    Set<String> set2=notsamemap.getOrDefault(s2,new HashSet<>());
//                    set1.add(s2);
//                    notsamemap.put(s1,set1);
//                    set2.add(s1);
//                    notsamemap.put(s2,set2);
//                }
//            }
//
//            for (String s : samemap.keySet()) {
//                Set<String> sameset=samemap.get(s);
//                Set<String> notsameset=notsamemap.getOrDefault(s,new HashSet<>());
//                for (String s1 : sameset) {
//                    Set<String> set=notsamemap.getOrDefault(s1,new HashSet<>());
//                    notsameset.addAll(set);
//                }
//                notsamemap.put(s,notsameset);
//                System.out.print(s+","+sameset+",");
//                System.out.println(notsameset);
//            }
//
//            for (String s : notsamemap.keySet()) {
//                Set<String> sameset=samemap.getOrDefault(s,new HashSet<>());
//                Set<String> notsameset=notsamemap.get(s);
//                for (String s1 : notsameset) {
//                    if (sameset.contains(s1) || s.equals(s1)) return false;
//                }
//            }
//
//            return true;
//        }
//    }

    class Solution_v2 {
        public boolean equationsPossible(String[] equations) {
            int length = equations.length;
            int[] parent = new int[26];
            for (int i = 0; i < 26; i++) {
                parent[i] = i;
            }
            for (String str : equations) {
                if (str.charAt(1) == '=') {
                    int index1 = str.charAt(0) - 'a';
                    int index2 = str.charAt(3) - 'a';
                    union(parent, index1, index2);
                }
            }
            for (String str : equations) {
                if (str.charAt(1) == '!') {
                    int index1 = str.charAt(0) - 'a';
                    int index2 = str.charAt(3) - 'a';
                    if (find(parent, index1) == find(parent, index2)) {
                        return false;
                    }
                }
            }
            return true;
        }

        public void union(int[] parent, int index1, int index2) {
            parent[find(parent, index1)] = find(parent, index2);
        }

        public int find(int[] parent, int index) {
            while (parent[index] != index) {
                parent[index] = parent[parent[index]];
                index = parent[index];
            }
            return index;
        }
    }
}
