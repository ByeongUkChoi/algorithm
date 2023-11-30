/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        int length = 0;
        while (node != null) {
            stack.add(node);
            node = node.next;
            length++;
        }

        int[] nums = new int[length];
        node = head;
        for (int i = 0; i < length - 1; i++) {
            nums[i++] = node.val;
            node = node.next;
            nums[i] = stack.pop().val;
        }
        if (length % 2 == 1) {
            nums[length - 1] = node.val;
        }

        node = head;
        for (int num : nums) {
            node.val = num;
            node = node.next;
        }
    }
}