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
        /*ListNode bye = head;
        int count=0;
        while(bye!=null)
        {
            count++;
            bye = bye.next;
        }
        if(count==n)
        {
            return head.next;
        }
        bye = head;
        for(int i=1;i<count-n;i++)
        {
            bye = bye.next;
        }
        bye.next = bye.next.next;
        return head;
        */
        ListNode fast = head;
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        if(fast==null)
        {
            return head.next;
        }
        ListNode slow = head;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
