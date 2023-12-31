/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        return countNodesWithChild(root)
    }

    private fun countNodesWithChild(node: TreeNode): Int {
        return when {
            node.left == null && node.right == null -> 1
            node.left == null -> countNodesWithChild(node.right!!) + 1
            node.right == null -> countNodesWithChild(node.left!!) + 1
            else -> countNodesWithChild(node.left!!) + countNodesWithChild(node.right!!) + 1
        }
    }
}