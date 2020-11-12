/**
 * @param {number[]} A
 * @return {number}
 */
var longestMountain = function(A) {
    let max=0;
    for (let i = 1; i < A.length-1; i++) {
        if (!(A[i-1] < A[i] && A[i] > A[i+1])) continue;
        let length=0;
        let left=i-1, right=i+1;
        while (left >= 0 && A[left] < A[left+1]) {
            left--;
            length++;
        }
        while (right < A.length && A[right] < A[right-1]) {
            right++;
            length++;
        }
        if (length >= 3)
            max = Math.max(max,length);
    }
    return max;
};