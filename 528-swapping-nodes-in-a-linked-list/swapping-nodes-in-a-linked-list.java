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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for(int i =1; i< k; i++){
            first = first.next;
        }
        ListNode last = head;
        ListNode temp = first;
        while(temp.next != null){
            last = last.next;
            temp = temp.next;
        }
        int t = first.val;
        first.val = last.val;
        last.val = t;

        return head;
        
    }
}