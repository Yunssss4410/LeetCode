/**
 * @param {number[]} nums
 * @return {number[]}
 */

var smallerNumbersThanCurrent = function (nums) {
    const len = nums.length;
    const data = Array(len).fill(0).map(value => Array(2).fill(0));
    for (let i = 0; i < len; ++i) {
        data[i][0] = nums[i];
        data[i][1] = i;
    }
    data.sort((a, b) =>  a[0] - b[0]);
    let res=Array(len);
    res[data[0][1]]=0;
    for (let i = 1; i < len; i++) {
        res[data[i][1]] = data[i][0] !== data[i-1][0]?i:res[data[i-1][1]];
    }
    return res;
};
