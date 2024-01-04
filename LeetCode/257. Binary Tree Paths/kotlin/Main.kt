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
    private val paths = mutableListOf<String>()

    fun binaryTreePaths(root: TreeNode?): List<String> {
        if (root == null) return paths
        traverseTree(root, "")
        return paths
    }

    private fun traverseTree(node: TreeNode, path: String) {
        val currentPath = if (path.isEmpty()) "${node.`val`}" else "$path->${node.`val`}"

        if (node.left == null && node.right == null) {
            paths.add(currentPath)
            return
        }

        node.left?.let { traverseTree(it, currentPath) }
        node.right?.let { traverseTree(it, currentPath) }
    }
}