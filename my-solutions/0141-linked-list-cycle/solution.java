/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
        {
            return false;
        }
        else
        {
            ListNode fp = head;
            ListNode sp = head;
            while(fp!=null && sp!=null && sp.next!=null)
            {
                fp=fp.next;
                sp=sp.next.next;
                if(fp==sp)
                {
                    return true;
                }
            }
            return false;
        }
        
    }
}
