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
        List<Integer> values = new ArrayList<>();

        ListNode curr = list1;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        curr = list2;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        if (values.isEmpty()) {
            return null;
        }

        Collections.sort(values);

        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        for (int val : values) {
            head.next = new ListNode(val);
            head = head.next;
        }
        
        return dummy.next;
    }
}