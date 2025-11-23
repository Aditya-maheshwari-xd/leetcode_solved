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
    public ListNode sortList(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            arr.add(temp.val);
            temp=temp.next;
            count++;
        }
        Collections.sort(arr);
        temp = head;
        for(int i=0;i<count;i++)
        {
            temp.val = arr.get(i);
            temp=temp.next;
        }
        return head;
    }
}
