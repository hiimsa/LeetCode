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
        // Find the length of the list
        int listLength = 0; 
        ListNode prev=null, temp=head;
        while(temp!=null){
            listLength++;
            prev = temp;
            temp = temp.next;
        }
        if (listLength<1)
          return head;

        if(k>=listLength)
            k = k % listLength;
        if (k==0)
          return head;

        temp = head;
        for(int i=1; i <listLength - k; i++){
            temp = temp.next;
        }
        //last node to 1st node
        prev.next = head;
        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;
    }
}