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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy; // node before the group to reverse

        while (true) {
            // find the end of the next k-group
            ListNode end = prev;
            for (int i = 0; i < k && end != null; i++) end = end.next;
            if (end == null) break; // not enough nodes for another group

            // mark start and nextGroup
            ListNode start = prev.next;
            ListNode nextGroup = end.next;

            // detach group and reverse it
            end.next = null;           // temporarily terminate the group
            prev.next = reverse(start); // reverse returns new head of this group

            // reconnect tail of reversed group (which is original start)
            start.next = nextGroup;

            // move prev to tail of the reversed group (original start)
            prev = start;
        }

        return dummy.next;
    }

    // helper: reverse a linked list and return new head
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}

