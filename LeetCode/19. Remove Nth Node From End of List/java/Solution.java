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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = length(head);
        int removeIndex = length - n;
        if (removeIndex == 0) {
            return head.next;
        }
        ListNode node = head;
        for (int i = 0; node != null && i < length; i++) {
            if (i == removeIndex - 1) {
                node.next = node.next.next;
            }
            node = node.next;
        }
        return head;
    }

    private int length(ListNode head) {
        return length(head, 1);
    }

    private int length(ListNode node, int acc) {
        if (node.next == null) {
            return acc;
        }
        return length(node.next, acc + 1);
    }
}
