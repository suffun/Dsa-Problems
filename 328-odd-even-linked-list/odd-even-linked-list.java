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
    public ListNode oddEvenList(ListNode head) {

        if(head == null) return null;

        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);

        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;

        ListNode curr = head;
        int pos = 1;

        while(curr != null) {

            if(pos % 2 == 1) {
                oddTail.next = curr;
                oddTail = curr;
            } else {
                evenTail.next = curr;
                evenTail = curr;
            }

            curr = curr.next;
            pos++;
        }

        oddTail.next = evenDummy.next;
        evenTail.next = null;

        return oddDummy.next;
    }
}