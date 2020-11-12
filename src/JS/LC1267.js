/**
 * @param {number[][]} grid
 * @return {number}
 */
var countServers = function(grid) {
    let m = grid.length;
    let n = grid[0].length;
    let cont_m = Array(m).fill(0);
    let cont_n = Array(n).fill(0);
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (grid[i][j]) {
                cont_m[i]++;
                cont_n[j]++;
            }
        }
    }
    let ans = 0;
    for (let i = 0; i < m; i++) {
        for (let j = 0; j < n; j++) {
            if (grid[i][j] && (cont_m[i] > 1 || cont_n[j] > 1)) {
                ans++;
            }
        }
    }
    return ans;
};