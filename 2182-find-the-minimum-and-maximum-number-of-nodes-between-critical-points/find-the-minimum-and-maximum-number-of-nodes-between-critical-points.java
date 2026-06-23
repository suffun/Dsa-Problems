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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        ArrayList<Integer> pos = new ArrayList<>();

        ListNode prev = head;
        ListNode curr = head.next;
        int idx = 1;

        while(curr.next != null){

            if((curr.val > prev.val && curr.val > curr.next.val) ||
               (curr.val < prev.val && curr.val < curr.next.val)){
                pos.add(idx);
            }

            prev = curr;
            curr = curr.next;
            idx++;
        }

        if(pos.size() < 2){
            return new int[]{-1, -1};
        }

        int minDist = Integer.MAX_VALUE;

        for(int i = 1; i < pos.size(); i++){
            minDist = Math.min(minDist, pos.get(i) - pos.get(i - 1));
        }

        int maxDist = pos.get(pos.size() - 1) - pos.get(0);

        return new int[]{minDist, maxDist};
    }
}