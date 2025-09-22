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
        ListNode fp = list1;
        ListNode sp = list2;
        ListNode ans = null;
        ListNode head = null;
        ListNode tail = null;
        while(fp!= null || sp!=null )
        {
            if(fp!= null && sp!= null)
            {
            if(fp.val<=sp.val)
            {
                ans=fp;
                fp=fp.next;
            }
            else
            {
                ans=sp;
                sp=sp.next;
            }
            }
            else if (fp!=null)
            {
                ans =fp;
                fp=fp.next;
            }
            else
            {
                ans =sp;
                sp=sp.next;
            }
            tail = insertAtEnd(tail,ans.val);
            if(head==null)
            {
                head=tail;
            }

        }
        return head;
    }
    private ListNode insertAtEnd(ListNode tail,int val)
    {
        ListNode nodetoinsert = new ListNode(val);
        if(tail!=null)
        {
            tail.next= nodetoinsert;
        }
        return nodetoinsert;
    }
}
