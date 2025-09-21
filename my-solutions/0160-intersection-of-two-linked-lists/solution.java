/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = calculatelength(headA);
        int lb = calculatelength(headB);
        ListNode fp = headA;
        ListNode sp = headB;
        if(la>lb)
        {
            int diff = la-lb;
            for(int i=0;i<diff;i++)
            {
                fp =fp.next;    
            }
        }
        if(lb>=la)
        {
            int diff = lb-la;
            for(int i=0;i<diff;i++)
            {
                sp=sp.next;
            }
        }
        return checkintersection(fp,sp);
    }
    private ListNode checkintersection(ListNode fp,ListNode sp)
        {
            while (fp!=null && sp!=null)
            {
            if(fp==sp)
            {
                return fp;
            }
            else{
                fp=fp.next;
                sp=sp.next;
            }
            }
            return null;

        }
        public int calculatelength(ListNode head)
        {
            ListNode current = head;
            int length =0;
            while(current!= null)
            {
                current = current.next;
                length++;
            }
            return length;
        }

        
}
