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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int nodeLength = nodeLength(head);
        k = k % nodeLength;
        if (k == 0) {
            return head;
        }
        int notRotateCount = nodeLength - k;

        ListNode node = head;
        for (int i = 1; i < notRotateCount; i++) {
            node = node.next;
        }
        ListNode newHead = node.next;
        node.next = null;

        ListNode tmp = newHead;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = head;
        return newHead;
    }

    private int nodeLength(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            length++;
        }
        return length;
    }
}

