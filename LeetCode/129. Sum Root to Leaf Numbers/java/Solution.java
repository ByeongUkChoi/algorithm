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
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    public int sumNumbers(TreeNode node, int acc) {
        if (node == null) {
            return acc;
        }
        acc = acc * 10 + node.val;
        if (node.left == null && node.right == null) {
            return acc;
        }
        if (node.left == null) {
            return sumNumbers(node.right, acc);
        }
        if (node.right == null) {
            return sumNumbers(node.left, acc);
        }
        return sumNumbers(node.left, acc) + sumNumbers(node.right, acc);
    }
}
