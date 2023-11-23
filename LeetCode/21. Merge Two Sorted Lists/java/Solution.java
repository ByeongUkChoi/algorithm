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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        ListNode answer = new ListNode();
        ListNode answerCursor = answer;
        if (list1 == null) {
            answerCursor.val = list2.val;
            list2 = list2.next;
        } else if (list2 == null) {
            answerCursor.val = list1.val;
            list1 = list1.next;
        } else {
            if (list1.val < list2.val) {
                answerCursor.val = list1.val;
                list1 = list1.next;
            } else {
                answerCursor.val = list2.val;
                list2 = list2.next;
            }
        }
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                answerCursor.next = new ListNode(list2.val);
                answerCursor = answerCursor.next;
                list2 = list2.next;
            } else if (list2 == null) {
                answerCursor.next = new ListNode(list1.val);
                answerCursor = answerCursor.next;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                answerCursor.next = new ListNode(list1.val);
                answerCursor = answerCursor.next;
                list1 = list1.next;
            } else {
                answerCursor.next = new ListNode(list2.val);
                answerCursor = answerCursor.next;
                list2 = list2.next;
            }
        }
        return answer;
    }
}
