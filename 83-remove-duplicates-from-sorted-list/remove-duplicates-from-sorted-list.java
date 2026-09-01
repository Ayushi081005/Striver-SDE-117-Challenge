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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        java.util.List<Integer> values = new java.util.ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        java.util.Set<Integer> seen = new java.util.LinkedHashSet<>();
        for (int val : values) {
            seen.add(val);
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int val : seen) {
            tail.next = new ListNode(val);
            tail = tail.next;
        }

        return dummy.next;
    }
}