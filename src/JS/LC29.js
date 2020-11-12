function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @return {number}
 */
var sumNumbers = function(root) {
    return dfs(root,0);
};

/**
 *
 * @param {TreeNode} root
 * @param {number} preSum
 */
var dfs= function (root,preSum) {
    if (root == null) return 0;
    let sum = preSum*10 + root.val;
    if (root.left == null && root.right == null) return sum;
    else return dfs(root.left,sum)+dfs(root.right,sum);
}