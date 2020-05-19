package Hard;

public class LC601 {
    /*
    601. 体育馆的人流量
    URL：https://leetcode-cn.com/problems/human-traffic-of-stadium/
    注：这是一道MYSQL的题
    解答：   SELECT DISTINCT S1.*
            FROM stadium as S1,stadium as S2,stadium as S3
            WHERE   S1.people>=100 AND S2.people>=100 AND S3.people>=100 AND (
                    S1.id +1 = S2.id AND S1.id+2=S3.id OR
                    S1.id +1 = S2.id AND S1.id-1=S3.id OR
                    S1.id -1 = S2.id AND S1.id-2=S3.id
            )
            ORDER BY S1.id
     */
}
