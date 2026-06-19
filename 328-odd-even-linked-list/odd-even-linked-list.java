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

        ListNode t1 = oddDummy;
        ListNode t2 = evenDummy;

        ListNode curr = head;
        while(curr != null){
            t1.next = curr;
            curr = curr.next;
            t1 = t1.next;

            t2.next = curr;
            if(curr != null) curr = curr.next;
            t2 = t2.next;
        }
        t1.next = evenDummy.next;
        return oddDummy.next;
    }
}