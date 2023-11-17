/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode pruneTree(TreeNode node) {
        if (node == null) {
            return null;
        }
        node.left = pruneTree(node.left);
        node.right = pruneTree(node.right);
        if (node.left == null && node.right == null && node.val == 0) {
            return null;
        }
        return node;
    }
}
