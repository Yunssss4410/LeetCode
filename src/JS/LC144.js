
function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var preorderTraversal = function(root) {
    let res = [];
    preorder(root,res);
    return res;
};

/**
 *
 * @param {TreeNode}root
 * @param {number[]}res
 */
var preorder = function (root,res) {
    if (root == null) return;
    res.push(root.val);
    preorder(root.left,res);
    preorder(root.right,res);
}