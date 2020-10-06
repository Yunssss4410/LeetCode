package Middle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC1452 {
    /*
    1452. 收藏清单
     */
    class Solution {
        public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
            List<Integer> res=new ArrayList<>();
            for (int i = 0; i < favoriteCompanies.size(); i++) {
                List<String> check=favoriteCompanies.get(i);
                boolean safe=true;
                for (int j = 0; j < favoriteCompanies.size(); j++) {
                    if (i == j || check.size() >= favoriteCompanies.get(j).size()) continue;
                    Set<String> set=new HashSet<>(favoriteCompanies.get(j));
                    if (set.containsAll(check)) {
                        safe=false;
                        break;
                    }
                }
                if (safe) res.add(i);
            }
            return res;
        }
    }
}
