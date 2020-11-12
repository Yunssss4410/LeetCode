/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function(arr) {
    const occur =new Map();
    for (const x of arr) {
        if (occur.has(x)) {
            occur.set(x, occur.get(x) + 1);
        } else {
            occur.set(x, 1);
        }
    }

    const times =new Set();
    for (const [key, value] of occur) {
        if (times.has(value)) return false;
        times.add(value);
    }
    return true;
};