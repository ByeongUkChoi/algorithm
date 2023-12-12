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
    public int getMinimumDifference(TreeNode root) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Stack<TreeNode> stack = new Stack<>();
        minHeap.add(root.val);
        addChildrenToStack(stack, root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            minHeap.add(node.val);
            if (hasChild(node)) {
                addChildrenToStack(stack, node);
            }
        }

        int[] diff = new int[minHeap.size() - 1];
        int prev = minHeap.remove();
        for (int i = 0; i < diff.length; i++) {
            int current = minHeap.remove();
            diff[i] = current - prev;
            prev = current;
        }
        return Arrays.stream(diff).min().getAsInt();
    }

    private boolean hasChild(TreeNode node) {
        return node.left != null || node.right != null;
    }

    private void addChildrenToStack(Stack<TreeNode> stack, TreeNode parent) {
        if (parent.left == null && parent.right == null) {
            return;
        }
        if (parent.left != null) {
            stack.add(parent.left);
        }
        if (parent.right != null) {
            stack.add(parent.right);
        }
    }
}
