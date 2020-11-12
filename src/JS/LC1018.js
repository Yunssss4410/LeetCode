/**
 * @param {number[]} A
 * @return {boolean[]}
 */
var prefixesDivBy5 = function (A) {
    if (A.length < 1) return [];
    let res = [];
    let num = A[0];
    res[0] = num === 0;
    for (let i = 1; i < A.length; i++) {
        num = num * 2 %10 + A[i];
        res[i] = num % 5 === 0;
    }
    return res;
};
